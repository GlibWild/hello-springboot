package com.test.hello.controllers;

import com.test.hello.bean.Book;
import com.test.hello.bean.User;
import com.test.hello.bean.UserMapper;
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

    @Autowired
    private UserMapper userDtoMapper;
    @Autowired
    private UserMapper userMapper;

    @GetMapping("config") //路由post注解
    public WorkDto hello() {
        log.info(work.toString());
        WorkDto workDto = WorkDtoMapper.INSTANCE.toDto(work);
        log.info(workDto.toString());
        return workDto;
    }

    @GetMapping("/user/{id}")
    public UserDto user(@PathVariable int id) {
        User user = userMapper.findById(id);
        return UserDtoMapper.INSTANCE.toDto(user);
    }

    @GetMapping("/{id}") //路由get注解
    public BookDto test(@PathVariable String id) {
        var map = new HashMap<String, String>();
        map.put("类型", "儿童读物");
        var book = new Book(id, "xxx", 123, map, new Date());
        var bookdto = BookDtoMapper.INSTANCE.toBookDto(book);

        return bookdto;
    }
}

