package com.channelblog.dailyblog.repo;


import com.channelblog.dailyblog.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface CommentRepo extends MongoRepository<Comment, String> {

    Comment deleteCommentByCommentId(String commentId);

    List<Comment> findByBlogId(String blogId , Pageable pageable);

    Comment findCommentsByBlogId(String commentId);
}
