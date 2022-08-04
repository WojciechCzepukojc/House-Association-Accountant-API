package com.example.flat.repositories;

import com.example.commons.model.Flat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlatRepository extends JpaRepository<Flat, Long> {
}
