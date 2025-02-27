package com.test.hello.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@AllArgsConstructor //实体类注解，自动创建全字段构造函数
@Data //实体类注解，自动完成getter setter
public class Book {
    String name;
    String author;
    int price;
    Map<String, String> tips;
    Date publishDate;


}
