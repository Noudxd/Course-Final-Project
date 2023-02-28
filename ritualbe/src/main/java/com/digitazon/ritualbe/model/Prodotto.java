package com.digitazon.ritualbe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Prodotto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String categoria;

    @Column
    private String nomeProdotto;

    @Column
    private String pathImg;

    @Column
    private Double prezzo;

    public Prodotto(String categoria, String nomeProdotto, String pathImg, Double prezzo) {
        this.categoria = categoria;
        this.nomeProdotto = nomeProdotto;
        this.pathImg = pathImg;
        this.prezzo = prezzo;
    }

}
