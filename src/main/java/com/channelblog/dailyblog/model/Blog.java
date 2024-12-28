package com.channelblog.dailyblog.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Blog {

    @Id
    private ObjectId blogId;

    private String tittle;

    private String description;

    private boolean publish;

    private ObjectId userId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
