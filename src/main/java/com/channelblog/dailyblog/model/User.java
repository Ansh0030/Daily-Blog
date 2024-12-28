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
public class User {

    @Id
    private ObjectId userId;

    private String password;

    private String fullname;

    private String username;

    private byte role;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
