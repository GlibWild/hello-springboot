package com.test.hello.controllers;

import com.test.hello.bean.Book;
import com.test.hello.bean.Work;
import com.test.hello.dto.BookMapper;
import com.test.hello.dto.BookDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController //Controller+ResponseBody注解
@Slf4j //日志注解
@RequestMapping("/hello") //控制器路由
public class HelloController {

    @Autowired //自动注入
    private Work work;

    @GetMapping("config") //路由post注解
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<>();
        map.put("workId", work.getWorkId() + "");
        map.put("defaultPassword", work.getDefaultPassword());
        return map;
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

