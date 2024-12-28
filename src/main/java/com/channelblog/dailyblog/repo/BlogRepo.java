package com.channelblog.dailyblog.repo;

import com.channelblog.dailyblog.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface BlogRepo extends MongoRepository<Blog, String> {

    Blog deleteBlogById(String blogId);

    List<Blog> findbyUserId(String userId , Pageable pageable);

    Blog findbyBlogId(String blogId);

}
