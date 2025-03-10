package com.test.hello.dto;

import com.test.hello.bean.Work;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface WorkDtoMapper {
    WorkDtoMapper INSTANCE = Mappers.getMapper(WorkDtoMapper.class);
    WorkDto toDto(Work work);
    
}
