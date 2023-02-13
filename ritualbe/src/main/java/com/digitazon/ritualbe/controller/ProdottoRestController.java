package com.digitazon.ritualbe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitazon.ritualbe.model.Prodotto;
import com.digitazon.ritualbe.service.ProdottoService;

@RestController
@RequestMapping("/api/prodotto")
@CrossOrigin
public class ProdottoRestController {

    @Autowired
    ProdottoService prodottoService;

    @GetMapping("/all")
    public ResponseEntity<List<Prodotto>> getAllProducts(){
        return new ResponseEntity<>(prodottoService.getAll(), HttpStatus.OK);

    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Prodotto> getProdottoById(@PathVariable long id) {
 
       return new ResponseEntity<Prodotto>(prodottoService.getProdottoById(id), HttpStatus.OK);
 
    }

    @PostMapping("/create")
    public ResponseEntity<Prodotto> createProdotto(@RequestBody Prodotto newProdotto) {

        return new ResponseEntity<>(prodottoService.createProdotto(newProdotto), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Prodotto> updateProdotto(@RequestBody Prodotto newProdotto, @PathVariable long id) {
 
       return new ResponseEntity<Prodotto>(prodottoService.updateProdotto(newProdotto), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProdottoById(@PathVariable long id) {
 
       prodottoService.deleteProdottoById(id);
       return new ResponseEntity<>("Prodotto eliminato", HttpStatus.OK);
    }
    
}
