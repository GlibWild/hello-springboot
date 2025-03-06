package com.test.hello.dto;

import com.test.hello.bean.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring") //mapstruct注解
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mappings({ //映射关系
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "author", target = "author"),
            @Mapping(source = "price", target = "price")
    })
    BookDto toBookDto(Book book);
}

