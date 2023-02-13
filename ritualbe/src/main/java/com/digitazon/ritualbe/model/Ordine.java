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

    @ManyToMany
    private List<Prodotto> prodotti;

    @Column
    private int quantita;

    @Column
    private double totaleOrdine;

    @Column
    private LocalDate dataOrdine;

    @Column
    private int numTavolo;

    @Column
    private int numPersone;

    @ManyToOne
    private Utente utente;

    
    

    
}
