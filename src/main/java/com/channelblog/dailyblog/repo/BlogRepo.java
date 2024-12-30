package com.channelblog.dailyblog.repo;

import com.channelblog.dailyblog.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface BlogRepo extends MongoRepository<Blog, String> {

    Blog deleteBlogByBlogId(String blogId);

    List<Blog> findByUserId(String userId , Pageable pageable);

    Blog findByBlogId(String blogId);

}
