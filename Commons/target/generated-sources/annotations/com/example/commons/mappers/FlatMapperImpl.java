package com.example.commons.mappers;

import com.example.commons.dto.FlatDto;
import com.example.commons.model.Flat;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-04T17:51:28+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class FlatMapperImpl implements FlatMapper {

    @Override
    public FlatDto map(Flat flat) {
        if ( flat == null ) {
            return null;
        }

        FlatDto.FlatDtoBuilder flatDto = FlatDto.builder();

        flatDto.id( flat.getId() );
        flatDto.streetName( flat.getStreetName() );
        flatDto.area( flat.getArea() );
        flatDto.residentsNumber( flat.getResidentsNumber() );
        flatDto.rent( flat.getRent() );

        return flatDto.build();
    }

    @Override
    public Flat map(FlatDto flatDto) {
        if ( flatDto == null ) {
            return null;
        }

        Flat flat = new Flat();

        flat.setId( flatDto.getId() );
        flat.setStreetName( flatDto.getStreetName() );
        flat.setFlatNumber( flatDto.getFlatNumber() );
        flat.setArea( flatDto.getArea() );
        flat.setResidentsNumber( flatDto.getResidentsNumber() );
        flat.setRent( flatDto.getRent() );

        return flat;
    }
}
