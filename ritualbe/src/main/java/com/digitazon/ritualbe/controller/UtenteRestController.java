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

import com.digitazon.ritualbe.model.Utente;
import com.digitazon.ritualbe.service.UtenteService;

@RestController
@RequestMapping("/api/utente")
@CrossOrigin
public class UtenteRestController {

    @Autowired
    UtenteService utenteService;

    @GetMapping("/all")
    public ResponseEntity<List<Utente>> getAllUtenti() {
        return new ResponseEntity<>(utenteService.getAll(), HttpStatus.OK);

    }

    @GetMapping("/find/{email}")
    public ResponseEntity<Utente> getUtenteByEmail(@PathVariable String email) {
 
       return new ResponseEntity<Utente>(utenteService.findUtenteByEmail(email), HttpStatus.OK);
 
    }

    @PostMapping("/create")
    public ResponseEntity<Utente> createUtente(@RequestBody Utente newUtente) {

        return new ResponseEntity<>(utenteService.creaUtente(newUtente), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{email}")
    public ResponseEntity<String> deleteUtentebyEmail(@PathVariable String email) {
 
       utenteService.deleteUtenteByEmail(email);
       return new ResponseEntity<>("Utente eliminato", HttpStatus.OK);
    }

}
