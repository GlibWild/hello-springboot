package com.test.hello.bean;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Data //实体类注解，自动完成getter setter
@Configuration
@ConfigurationProperties(prefix = "test") //读取配置参数，前缀为test
@Validated //配置校验
public class Work {
    @Min(1)
    int workId;
    @NotNull
    String defaultPassword;
}
