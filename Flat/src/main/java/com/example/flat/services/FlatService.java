package com.example.flat.services;

import com.example.commons.dto.FlatDto;
import com.example.commons.exceptions.ResourceNotFoundException;
import com.example.commons.mappers.FlatMapper;
import com.example.commons.model.Flat;
import com.example.flat.repositories.FlatRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FlatService {

private final FlatMapper flatMapper;

private final FlatRepository flatRepository;


public void create(FlatDto flatDto){
    Flat flat = flatMapper.map(flatDto);
    flatRepository.save(flat);
    log.debug("Created flat with id " + flat.getId());
}

public Flat getFlat(Long id){
    return flatRepository.findById(id)
            .orElseThrow(()-> getFlatNotFoundException(id));
}

public FlatDto getById(Long id){
    Flat flat = getFlat(id);
    return flatMapper.map(flat);
}

private ResourceNotFoundException getFlatNotFoundException(Long id){
    return new ResourceNotFoundException(String.format("Flat with id '%s' not found", id));
}



}
