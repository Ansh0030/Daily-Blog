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
public class BlogUpdate {

    @Id
    private ObjectId blogId;

    private String tittle;

    private String description;

    private boolean publish;

    private ObjectId userId;
}
