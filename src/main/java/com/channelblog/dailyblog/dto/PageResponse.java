package com.channelblog.dailyblog.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PageResponse {

    private Integer pageNo;
    private Integer pageSize;
    private String sortBy;
    private String value;

}
