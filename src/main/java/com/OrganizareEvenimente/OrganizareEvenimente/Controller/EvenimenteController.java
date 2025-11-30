package com.OrganizareEvenimente.OrganizareEvenimente.Controller;


import com.OrganizareEvenimente.OrganizareEvenimente.General.Eveniment;
import com.OrganizareEvenimente.OrganizareEvenimente.Repository.EvenimenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EvenimenteController {
    @Autowired
    EvenimenteRepository repository;
    @GetMapping("jpa/evenimente")
    public List<Eveniment> findAll(){
        return repository.findAll();
    }
}
