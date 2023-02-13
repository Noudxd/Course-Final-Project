package com.digitazon.ritualbe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitazon.ritualbe.model.Ordine;

public interface OrdineRepository extends JpaRepository<Ordine, Long> {
    
}
