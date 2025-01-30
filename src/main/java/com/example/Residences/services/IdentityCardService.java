package com.example.Residences.services;

import com.example.Residences.entities.identification.IdentityCard;
import com.example.Residences.generic.Generic_Service;
import com.example.Residences.generic.Generic_ServiceImpl;
import com.example.Residences.repositories.IdentityCardRepository;
import org.springframework.stereotype.Service;

@Service
public class IdentityCardService extends Generic_ServiceImpl<IdentityCard,String, IdentityCardRepository> implements Generic_Service<IdentityCard,String> {
    public IdentityCardService(IdentityCardRepository repository) {
        super(repository);
    }
}
