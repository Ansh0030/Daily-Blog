package com.channelblog.dailyblog.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class BlogCreate {

    private String tittle;

    private String description;

    private boolean publish;

    private ObjectId userId;
}
