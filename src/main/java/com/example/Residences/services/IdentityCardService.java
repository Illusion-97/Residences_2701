package com.example.Residences.services;

import com.example.Residences.dto.IdentityCardDto;
import com.example.Residences.entities.identification.IdentityCard;
import com.example.Residences.generic.Generic_Service;
import com.example.Residences.generic.Generic_ServiceImpl;
import com.example.Residences.mappers.IdentityCardMapper;
import com.example.Residences.repositories.IdentityCardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentityCardService extends Generic_ServiceImpl<IdentityCard,String, IdentityCardDto, IdentityCardRepository, IdentityCardMapper> implements Generic_Service<IdentityCardDto,String> {

    public IdentityCardService(IdentityCardRepository repository, IdentityCardMapper mapper) {
        super(repository, mapper);
    }
}
