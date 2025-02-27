package com.test.hello.dto;

import lombok.Data;

@Data //实体类注解，自动完成getter setter
public class BookDto {
    String name;
    String author;
    int price;
}
