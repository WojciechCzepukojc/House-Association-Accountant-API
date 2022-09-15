package com.example.rent.services;

import com.example.commons.dto.FlatDto;
import com.example.commons.dto.RentDto;
import com.example.commons.mappers.FlatMapper;
import com.example.commons.mappers.RentMapper;
import com.example.commons.model.Flat;
import com.example.commons.model.Rent;
import com.example.rent.httpClients.FlatClient;
import com.example.rent.repositories.RentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class RentService {


    private final RentMapper rentMapper;
    private final RentRepository rentRepository;

    private final FlatClient flatClient;

    private final FlatMapper flatMapper;

    public void create(RentDto rentDto) {
        Rent rent = rentMapper.map(rentDto);
        FlatDto flatDto = flatClient.getById(rentDto.getFlatId());
        Flat flat = flatMapper.map(flatDto);
        rent.setFlat(flat);

        rentRepository.save(rent);
        log.debug("Rent created successfully");


    }

//    private BigDecimal heatingCalculation(){
//        BigDecimal flatArea = rent.getFlat().getArea();
//        final double heatingRate = 2.37;
//        return flatArea.multiply(BigDecimal.valueOf(heatingRate));
//
//
//    }

}
