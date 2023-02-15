package com.digitazon.ritualbe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitazon.ritualbe.model.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Long> {

    public Utente findUtenteByEmail(String email);

}