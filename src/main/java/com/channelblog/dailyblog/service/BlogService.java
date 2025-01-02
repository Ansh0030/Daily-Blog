package com.channelblog.dailyblog.service;

import com.channelblog.dailyblog.dto.PageResponse;
import com.channelblog.dailyblog.model.Blog;
import com.channelblog.dailyblog.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogRepo blogRepo;

    public Blog createBlog(Blog blog) throws Exception{
        return blogRepo.save(blog);
    }

    public Blog updateBlog(Blog blog) throws Exception{
        return blogRepo.save(blog);
    }

    public Blog deleteBlog(String blogidId) throws Exception{
        return blogRepo.deleteBlogByBlogId(blogidId);
    }

    public List<Blog> getBlogs(PageResponse response) throws Exception{
        Pageable pageable = (Pageable) PageRequest.of(response.getPageNo(), response.getPageSize(), Sort.by(response.getSortBy()).descending());
        return blogRepo.findByUserId(response.getValue(), pageable);
    }

    public Blog getBlog(String blogidId) throws Exception{
        return blogRepo.findByBlogId(blogidId);
    }
}
