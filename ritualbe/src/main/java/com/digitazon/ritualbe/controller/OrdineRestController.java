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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitazon.ritualbe.model.Ordine;
import com.digitazon.ritualbe.service.OrdineService;

@RestController
@RequestMapping("/api/ordine")
@CrossOrigin
public class OrdineRestController {

    @Autowired
    OrdineService ordineService;

    @GetMapping("/all")
    public ResponseEntity<List<Ordine>> getAllOrders() {
        return new ResponseEntity<>(ordineService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Ordine> getOrdineById(@PathVariable long id) {

        return new ResponseEntity<Ordine>(ordineService.getOrdineById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Ordine> createOrdine(@RequestBody Ordine newOrdine) {

        return new ResponseEntity<>(ordineService.createOrdine(newOrdine), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteOrdineById(@PathVariable long id) {
 
       ordineService.deleteOrdineById(id);
       return new ResponseEntity<>("Ordine eliminato", HttpStatus.OK);
    }

}
