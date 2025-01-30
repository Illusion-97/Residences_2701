package com.example.Residences.services;

import com.example.Residences.entities.identification.Personne;
import com.example.Residences.generic.Generic_Service;
import com.example.Residences.generic.Generic_ServiceImpl;
import com.example.Residences.repositories.PersonneRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonneService extends Generic_ServiceImpl<Personne,Long, PersonneRepository> implements Generic_Service<Personne,Long> {
    public PersonneService(PersonneRepository repository) {
        super(repository);
    }
}
