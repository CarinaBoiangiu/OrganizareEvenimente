package com.OrganizareEvenimente.OrganizareEvenimente.Controller;


import com.OrganizareEvenimente.OrganizareEvenimente.General.Eveniment;
import com.OrganizareEvenimente.OrganizareEvenimente.Repository.EvenimenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class EvenimenteController {
    @Autowired
    EvenimenteRepository repository;
    //Functii GET
    @GetMapping("jpa/evenimente")
    public List<Eveniment> findAll(){
        return repository.findAll();
    }
    @GetMapping("jpa/evenimente/locatie/{denumire_locatie}")
    public List<Eveniment> findByLocatie(@PathVariable("denumire_locatie") String locatie){
        return repository.findByLocatie(locatie);
    }
    @GetMapping("jpa/evenimente/data/{data_eveniment}")
    public List<Eveniment> findByData(
            @PathVariable("data_eveniment")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data){
        return repository.findByData(data);
    }
    @GetMapping("jpa/evenimente/{id}")
    public Eveniment findByID(@PathVariable Long id){
        Optional<Eveniment> optionalEveniment = repository.findById(id);
        if(optionalEveniment.isPresent())
            return optionalEveniment.get();
        else
            throw new EvenimentNotFoundException("Evenimentul cu id-ul "+id+" nu a fost gasita");

    }

    //Functii Post
    @PostMapping("jpa/evenimente")
    public void addEveniment(@RequestBody Eveniment eveniment){
        repository.save(eveniment);
    }

    //Functie PUT
    @PutMapping("jpa/evenimente")
    public Eveniment updateEveniment(@RequestBody Eveniment eveniment) {
        return repository.save(eveniment);
    }

    //Functie Delete
    @DeleteMapping("jpa/evenimente/{id}")
    public void deliteById(@PathVariable Long id){
        repository.deleteById(id);
    }
}
