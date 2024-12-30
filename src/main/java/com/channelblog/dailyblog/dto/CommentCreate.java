package com.channelblog.dailyblog.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class CommentCreate {
    private String comment;

    private ObjectId blogId;

    private ObjectId userId;
}
