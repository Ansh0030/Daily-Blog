package com.channelblog.dailyblog.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CommentUpdate {
    @Id
    private ObjectId commentId;

    private String comment;

    private ObjectId blogId;

    private ObjectId userId;
}
