package com.example.commons.mappers;

import com.example.commons.dto.RentDto;
import com.example.commons.model.Rent;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-04T17:51:28+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class RentMapperImpl implements RentMapper {

    @Override
    public RentDto map(Rent rent) {
        if ( rent == null ) {
            return null;
        }

        RentDto.RentDtoBuilder rentDto = RentDto.builder();

        rentDto.id( rent.getId() );
        rentDto.heating( rent.getHeating() );
        rentDto.waterAndSewage( rent.getWaterAndSewage() );
        rentDto.garbage( rent.getGarbage() );
        rentDto.renovationFund( rent.getRenovationFund() );
        rentDto.accrualDate( rent.getAccrualDate() );
        rentDto.flat( rent.getFlat() );

        return rentDto.build();
    }

    @Override
    public Rent map(RentDto rentDto) {
        if ( rentDto == null ) {
            return null;
        }

        Rent rent = new Rent();

        rent.setId( rentDto.getId() );
        rent.setHeating( rentDto.getHeating() );
        rent.setWaterAndSewage( rentDto.getWaterAndSewage() );
        rent.setGarbage( rentDto.getGarbage() );
        rent.setRenovationFund( rentDto.getRenovationFund() );
        rent.setAccrualDate( rentDto.getAccrualDate() );
        rent.setFlat( rentDto.getFlat() );

        return rent;
    }
}
