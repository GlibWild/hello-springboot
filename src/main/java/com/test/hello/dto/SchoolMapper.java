package com.test.hello.dto;

import com.test.hello.bean.School;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SchoolMapper {
    SchoolMapper INSTANCE = Mappers.getMapper(SchoolMapper.class);
    SchoolDto toDto(School school);
}
