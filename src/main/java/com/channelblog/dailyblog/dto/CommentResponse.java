package com.channelblog.dailyblog.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class CommentResponse {
    private ObjectId commentId;

    private String comment;

    private ObjectId blogId;

    private ObjectId userId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
