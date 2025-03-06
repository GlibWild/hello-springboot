package com.test.hello.bean;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Data //实体类注解，自动完成getter setter
@Configuration
//读取配置参数，前缀为test，此处演示使用configurationProperties全部注入
@ConfigurationProperties(prefix = "test")
@Component
@Validated //配置校验
public class Work {
    @Value("${test.workId}") //可以直接取配置文件的值，不用整体使用configuration读取全部配置
    @Min(1)
    int workId;
    @Value("${test.defaultPassword}")
    @NotNull
    String defaultPassword;
    @Value("#{new java.text.SimpleDateFormat('${time.format}').format(new java.util.Date())}")
    String createTime;
}
