package com.example.commons.mappers;

import com.example.commons.dto.FlatDto;
import com.example.commons.model.Flat;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlatMapper {

    FlatDto map(Flat flat);

    Flat map(FlatDto flatDto);


}
