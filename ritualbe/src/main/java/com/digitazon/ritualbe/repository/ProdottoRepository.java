package com.digitazon.ritualbe.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.digitazon.ritualbe.model.Prodotto;

public interface ProdottoRepository extends JpaRepository <Prodotto, Long> {
    
}
