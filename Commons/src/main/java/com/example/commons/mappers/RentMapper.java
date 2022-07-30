package com.example.commons.mappers;

import com.example.commons.dto.RentDto;
import com.example.commons.model.Rent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RentMapper {

    RentDto map(Rent rent);

    Rent map(RentDto rentDto);
}
