package com.channelblog.dailyblog.repo;


import com.channelblog.dailyblog.model.Comment;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface CommentRepo extends MongoRepository<Comment, String> {

    Comment deleteCommentById(String commentId);

    List<Comment> findbyBlogId(String blogId , Pageable pageable);

    Comment findCommentsByBlogId(String commentId);
}
