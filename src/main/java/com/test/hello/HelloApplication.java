package com.test.hello;

import com.test.hello.bean.Work;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication //springboot应用入口
@EnableConfigurationProperties(Work.class) //允许读取系统配置参数
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

}
