package com.test.hello.dto;

import com.test.hello.bean.Work;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface WorkMapper{
    WorkMapper INSTANCE = Mappers.getMapper(WorkMapper.class);
    WorkDto toDto(Work work);
    
}
