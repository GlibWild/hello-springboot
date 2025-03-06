package com.test.hello.controllers;

import com.test.hello.bean.Book;
import com.test.hello.bean.School;
import com.test.hello.bean.Work;
import com.test.hello.dto.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;

@RestController //Controller+ResponseBody注解
@Slf4j //日志注解
@RequestMapping("/hello") //控制器路由
public class HelloController {

    @Autowired //自动注入
    private Work work;

    @GetMapping("config") //路由post注解
    public WorkDto hello() {
        log.info(work.toString());
        WorkDto workDto = WorkMapper.INSTANCE.toDto(work);
        log.info(workDto.toString());
        return workDto;
    }

    @GetMapping("/school")
    public SchoolDto school(){
        School school = new School();
        return SchoolMapper.INSTANCE.toDto(school);
    }

    @GetMapping("/{id}") //路由get注解
    public BookDto test(@PathVariable String id) {
        var map = new HashMap<String, String>();
        map.put("类型", "儿童读物");
        var book = new Book(id, "xxx", 123, map, new Date());
        var bookdto = BookMapper.INSTANCE.toBookDto(book);

        return bookdto;
    }
}

