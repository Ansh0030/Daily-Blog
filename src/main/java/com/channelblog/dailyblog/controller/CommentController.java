package com.channelblog.dailyblog.controller;


import com.channelblog.dailyblog.dto.CommentCreate;
import com.channelblog.dailyblog.dto.CommentUpdate;
import com.channelblog.dailyblog.dto.DBSResponse;
import com.channelblog.dailyblog.model.Comment;
import com.channelblog.dailyblog.service.CommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/comment")
    public ResponseEntity<DBSResponse> createComment(@RequestBody CommentCreate commentCreate){
        DBSResponse response = new DBSResponse();

        Comment comment = new Comment();
        try{
            BeanUtils.copyProperties(commentCreate, comment);
            Comment createdCommemnt = commentService.createComment(comment);
            response.setMessage("Comment is created Successfully");
            response.setData(createdCommemnt);
            return ResponseEntity.ok(response);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @PutMapping("/comment")
    public ResponseEntity<DBSResponse> updateComment(@RequestBody CommentUpdate commentUpdate){
        DBSResponse response = new DBSResponse();

        Comment comment = new Comment();
        try{
            BeanUtils.copyProperties(commentUpdate, comment);
            Comment createdCommemnt = commentService.createComment(comment);
            response.setMessage("Comment is created Successfully");
            response.setData(createdCommemnt);
            return ResponseEntity.ok(response);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @DeleteMapping("/comment/{commentId}")
    public ResponseEntity<DBSResponse> deleteComment(@PathVariable String commentId){
        DBSResponse response = new DBSResponse();

        try{
            commentService.deleteComment(commentId);
            response.setMessage("Comment is created Successfully");;
            return ResponseEntity.ok(response);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @GetMapping("/comment/{commentId}")
    public ResponseEntity<DBSResponse> getComment(@PathVariable String commentId){
        DBSResponse response = new DBSResponse();

        try{
            commentService.deleteComment(commentId);
            response.setMessage("Comment is created Successfully");;
            return ResponseEntity.ok(response);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

}
