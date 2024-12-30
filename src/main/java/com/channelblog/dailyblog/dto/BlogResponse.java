package com.channelblog.dailyblog.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class BlogResponse {

    private String blogId;

    private String title;

    private String description;

    private Boolean publish;

    private String userId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
