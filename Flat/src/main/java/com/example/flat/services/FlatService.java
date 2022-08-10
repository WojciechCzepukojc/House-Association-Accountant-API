package com.example.flat.services;

import com.example.commons.dto.FlatDto;
import com.example.commons.dto.PageDTO;
import com.example.commons.exceptions.ResourceNotFoundException;
import com.example.commons.exceptions.ResurceValidationException;
import com.example.commons.mappers.FlatMapper;
import com.example.commons.mappers.PagesMapper;
import com.example.commons.model.Flat;
import com.example.flat.repositories.FlatRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;



@Slf4j
@Service
@RequiredArgsConstructor
public class FlatService {

private final FlatMapper flatMapper;

private final FlatRepository flatRepository;

    private final PagesMapper<FlatDto> pagesMapper;


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

    @Cacheable("flatsPage")
    public PageDTO<FlatDto> getPage(PageRequest pageRequest) {
        Page<FlatDto> flatsPage = flatRepository.getFlatsPage(pageRequest);
        return pagesMapper.map(flatsPage);
    }

    public void updateById(Long id, FlatDto flatDto){
    if(!flatRepository.existsById(id)){
        log.warn("Flat with id '{}' not found", id);
        throw getFlatNotFoundException(id);
    }
    Long flatDtoId = flatDto.getId();
    if (!id.equals(flatDtoId)){
        log.warn("Id parameter '{}' and flat id '{}' does not match", id, flatDtoId);
        throw new ResurceValidationException(
                String.format("Id parameter '%s' and flat id '%s' does not match",
                        id, flatDtoId));
    }
    Flat flat = flatMapper.map(flatDto);
    flatRepository.save(flat);
    }

    public void deleteById(Long id){
        flatRepository.deleteById(id);
    }

private ResourceNotFoundException getFlatNotFoundException(Long id){
    return new ResourceNotFoundException(String.format("Flat with id '%s' not found", id));
}



}
