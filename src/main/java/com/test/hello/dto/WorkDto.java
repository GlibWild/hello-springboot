package com.test.hello.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class WorkDto {
    int workId;
    String defaultPassword;
    String createTime;
    String workName;
}
