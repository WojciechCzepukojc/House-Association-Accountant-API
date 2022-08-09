package com.example.flat.repositories;

import com.example.commons.dto.FlatDto;
import com.example.commons.model.Flat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FlatRepository extends JpaRepository<Flat, Long> {

    @Query("SELECT new com.example.commons.dto.FlatDto(f.id, f.streetName, f.flatNumber, f.area, f.residentsNumber) from flats f")
    Page<FlatDto> getFlatsPage(Pageable pageable);

}
