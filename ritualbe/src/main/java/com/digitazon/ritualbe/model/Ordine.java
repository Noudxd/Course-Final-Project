package com.digitazon.ritualbe.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDate dataOrdine;

    @Column
    private int numPersone;

    @Column
    private int numTavolo;

    @Column
    private int quantita;

    @Column
    private double totaleOrdine;

    @ManyToOne
    private Utente utente;

    @ManyToMany
    private List<Prodotto> prodotti;

    public Ordine(LocalDate dataOrdine, int numPersone, int numTavolo, int quantita, double totaleOrdine, Utente utente,
            List<Prodotto> prodotti) {
        this.dataOrdine = dataOrdine;
        this.numPersone = numPersone;
        this.numTavolo = numTavolo;
        this.quantita = quantita;
        this.totaleOrdine = totaleOrdine;
        this.utente = utente;
        this.prodotti = prodotti;
    }

}
