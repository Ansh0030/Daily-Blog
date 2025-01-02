package com.channelblog.dailyblog.controller;


import com.channelblog.dailyblog.dto.BlogCreate;
import com.channelblog.dailyblog.dto.BlogUpdate;
import com.channelblog.dailyblog.dto.DBSResponse;
import com.channelblog.dailyblog.dto.PageResponse;
import com.channelblog.dailyblog.model.Blog;
import com.channelblog.dailyblog.service.BlogService;
import lombok.Getter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class BlogController {

    @Autowired
    BlogService blogService;

    @PostMapping("/blog")
    public ResponseEntity<DBSResponse> createBlog(@RequestBody BlogCreate blogCreate){

        Blog blog = new Blog();
        DBSResponse response = new DBSResponse();

        try {
            BeanUtils.copyProperties(blogCreate, blog);
            Blog CreatedBlog = blogService.createBlog(blog);
            response.setMessage("Blog is created Successfully");
            response.setData(CreatedBlog);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/blog")
    public ResponseEntity<DBSResponse> updateBlog(@RequestBody BlogUpdate blogUpdate){
        Blog blog = new Blog();
        DBSResponse response = new DBSResponse();

        try{
            BeanUtils.copyProperties(blogUpdate, blog);
            Blog updatedBlog = blogService.updateBlog(blog);
            response.setMessage("Blog is updated Successfully");
            response.setData(updatedBlog);
            return ResponseEntity.ok(response);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/blog/{blogId}")
    public ResponseEntity<DBSResponse> deleteBlog(@PathVariable String blogId){

        DBSResponse response = new DBSResponse();

        try{
            blogService.deleteBlog(blogId);
            response.setMessage("Blog is deleted Successfully");
            return ResponseEntity.ok(response);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @GetMapping("/blog/{blogId}")
    public ResponseEntity<DBSResponse> getBlogs(@PathVariable String blogId){

        DBSResponse response = new DBSResponse();

        try{
            Blog blog = blogService.getBlog(blogId);
            response.setMessage("Blog is fetched Successfully");
            response.setData(blog);
            return ResponseEntity.ok(response);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/blog")
    public ResponseEntity<DBSResponse> getBlogs(@RequestParam(defaultValue = "1") int pageNo,
                                                @RequestParam(defaultValue = "10") int pageSize,
                                                @RequestParam(defaultValue ="id" ) String sortBy,
                                                @RequestParam(defaultValue = "1") String userId){

        DBSResponse response = new DBSResponse();

        PageResponse pageResponse = new PageResponse();

        pageResponse.setPageNo(pageNo);
        pageResponse.setPageSize(pageSize);
        pageResponse.setSortBy(sortBy);
        pageResponse.setValue(userId);

        try{
            List<Blog> blog = blogService.getBlogs(pageResponse);
            response.setMessage("Blog is fetched Successfully");
            response.setData(blog);
            return ResponseEntity.ok(response);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }



}
