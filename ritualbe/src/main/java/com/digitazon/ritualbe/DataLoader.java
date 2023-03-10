package com.digitazon.ritualbe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.digitazon.ritualbe.model.Ordine;
import com.digitazon.ritualbe.model.Prodotto;
import com.digitazon.ritualbe.model.Utente;
import com.digitazon.ritualbe.repository.ProdottoRepository;
import com.digitazon.ritualbe.service.OrdineService;
import com.digitazon.ritualbe.service.ProdottoService;
import com.digitazon.ritualbe.service.UtenteService;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    ProdottoService prodottoService;

    @Autowired
    ProdottoRepository prodottoRepository;

    @Autowired
    OrdineService ordineService;

    @Autowired
    UtenteService utenteService;

    @Override
    public void run(String... args) throws Exception {

        //Prodotto rituale1 = new Prodotto("rituale", "Rituale Macha", "/src/assets/images.rituale1.png", 7.00);
        //Prodotto rituale2 = new Prodotto("rituale", "Rituale Kobucha", "/src/assets/images.rituale2.png", 10.00);

        //prodottoService.createProdotto(rituale1);
        //prodottoService.createProdotto(rituale2);

        // prodottoService.deleteProdottoById((long) 1);

        // l'UPDATE non si testa nel DataLoader ma eventualmente in Postman
        // prodottoService.updateProdotto(rituale2);

        // List<Prodotto> prodotti = new ArrayList<>();

        // Prodotto p1 = new Prodotto("rituale1");
        // Prodotto p2 = new Prodotto("rituale 2");

        // prodotti.add(p1);
        // prodotti.add(p2);

        // prodottoRepository.saveAll(prodotti);

        // Utente utente1 = new Utente("Nadia", "nadia@email.com");
        // Utente utente2 = new Utente("Mara", "mara@gmail.com");

        // utenteService.creaUtente(utente1);
        // utenteService.creaUtente(utente2);

        // Ordine ordine1 = new Ordine(LocalDate.now(), 2, 5, 2, 15.00, utente2, prodotti);
        // Ordine ordine2 = new Ordine(LocalDate.now(), 3, 3, 2, 20.00, utente1, prodotti);
        
        // ordineService.createOrdine(ordine1);
        // ordineService.createOrdine(ordine2); 

    }

}
