package com.example.Residences.services;

import com.example.Residences.entities.identification.Personne;
import com.example.Residences.entities.identification.PersonneDto;
import com.example.Residences.generic.Generic_Service;
import com.example.Residences.generic.Generic_ServiceImpl;
import com.example.Residences.repositories.PersonneRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonneService extends Generic_ServiceImpl<Personne,Long, PersonneDto, PersonneRepository> implements Generic_Service<PersonneDto,Long> {
    public PersonneService(PersonneRepository repository) {
        super(repository);
    }
}
