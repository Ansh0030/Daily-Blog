package com.channelblog.dailyblog.service;

import com.channelblog.dailyblog.model.Blog;
import com.channelblog.dailyblog.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
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

    public List<Blog> getBlogs(String useridId ,Pageable pageable) throws Exception{
        return blogRepo.findByUserId(useridId, pageable);
    }

    public Blog getBlog(String blogidId) throws Exception{
        return blogRepo.findByBlogId(blogidId);
    }
}
