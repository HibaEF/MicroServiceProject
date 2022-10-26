package tn.esprit.gestionmagasin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import tn.esprit.gestionmagasin.entity.Facture;
import tn.esprit.gestionmagasin.service.FactureService;

@RestController
@RequestMapping(value="/api/factures")
@CrossOrigin("*")
public class FactureController {
    @Autowired
    FactureService factureservice;


    @GetMapping("/{id}")
    @ResponseBody
    public Facture getFacture(@PathVariable("id") int id) {
        return this.factureservice.getFacturebyId(id);
    }


    @GetMapping("/retrieve-all")
    @ResponseBody
    public List<Facture> getFactures() {
        List<Facture> listFacture = factureservice.retrieveAllFactures();
        return listFacture;

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Facture> createFacture(@RequestBody Facture facture){
        return new ResponseEntity<>(factureservice.addFacture(facture),HttpStatus.OK);
    }

    @PutMapping(value= "/{id}",  produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Facture> updateFacture(@PathVariable (value= "id") int id,@RequestBody Facture facture){
        return  new ResponseEntity<>(factureservice.updateFacture(id,facture),HttpStatus.OK);
    }



    @GetMapping(value= "/{id}",  produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Facture> afficherFactureid(@PathVariable (value= "id") int id){
        return  new ResponseEntity<>(factureservice.getFacturebyId(id),HttpStatus.OK);
    }


    @DeleteMapping(value= "/{id}",  produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteFacture(@PathVariable (value= "id") int id){
        return new ResponseEntity<>(factureservice.deleteFacture(id),HttpStatus.OK);
    }

}