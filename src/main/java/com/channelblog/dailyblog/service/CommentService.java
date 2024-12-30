package com.channelblog.dailyblog.service;

import com.channelblog.dailyblog.model.Comment;
import com.channelblog.dailyblog.repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepo commentRepo;

    public Comment createComment(Comment comment) throws Exception{
        return commentRepo.save(comment);
    }

    public Comment updateComment(Comment comment) throws Exception{
        return commentRepo.save(comment);
    }

    public Comment deleteComment(String commentId) throws Exception{
        return commentRepo.deleteCommentByCommentId(commentId);
    }

    public List<Comment> getComments(String blogId , Pageable pageable) throws Exception{
        return commentRepo.findByBlogId(blogId, pageable);
    }

    public Comment getComment(String commentId) throws Exception{
        return commentRepo.findCommentsByBlogId(commentId);
    }

}
