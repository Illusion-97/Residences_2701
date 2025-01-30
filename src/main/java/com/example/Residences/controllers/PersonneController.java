package com.example.Residences.controllers;

import com.example.Residences.entities.identification.Personne;
import com.example.Residences.generic.Generic_Controller;
import com.example.Residences.services.PersonneService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personnes")
public class PersonneController extends Generic_Controller<Personne,Long, PersonneService> {
    public PersonneController(PersonneService service) {
        super(service);
    }
}
