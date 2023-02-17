package com.digitazon.ritualbe.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.ritualbe.model.Utente;
import com.digitazon.ritualbe.repository.UtenteRepository;

@Service
public class UtenteService {

    List<Utente> utenti;

    @Autowired
    private UtenteRepository utenteRepository;

    public UtenteService() {
        utenti = new ArrayList<>();

        utenti.add(new Utente("Nadia", "nadia@email.com"));
        utenti.add(new Utente("Mara", "mara@gmail.com"));

    }

    public List<Utente> getAll() {
        return utenteRepository.findAll();
    }

    public Utente creaUtente(Utente utente) {

        Utente oldUtente = utenteRepository.findUtenteByEmail(utente.getEmail());
        if (oldUtente == null) {
            return utenteRepository.save(utente);
        }

        return null;

    }

    public Utente findUtenteByEmail(String email) {
        return utenteRepository.findUtenteByEmail(email);
    }

    public void deleteUtenteByEmail(String email) {
        Iterator<Utente> utenteIterator = utenti.iterator();

        while (utenteIterator.hasNext()) {
            Utente utenteTemp = utenteIterator.next();

            if (utenteTemp.getEmail().equals(email))
                utenteIterator.remove();
        }

    }
}
