package com.digitazon.ritualbe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.ritualbe.model.Ordine;
import com.digitazon.ritualbe.repository.OrdineRepository;

@Service
public class OrdineService {

    @Autowired
    private OrdineRepository ordineRepository;

    public List<Ordine> getAll() {
        return ordineRepository.findAll();
    }

    public Ordine createOrdine(Ordine ordine) {
        return ordineRepository.save(ordine);
    }

    public Ordine getOrdineById(Long id) {
        Optional<Ordine> ordineOpt = ordineRepository.findById(id);
        if (ordineOpt.isPresent()) {
            return ordineOpt.get();
        } else {
            return null;
        }
    }

    public void deleteOrdineById(Long id) {
        ordineRepository.deleteById(id);
    }

}
