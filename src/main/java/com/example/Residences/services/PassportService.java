package com.example.Residences.services;

import com.example.Residences.dto.PassportDto;
import com.example.Residences.entities.identification.Passport;
import com.example.Residences.generic.Generic_Service;
import com.example.Residences.generic.Generic_ServiceImpl;
import com.example.Residences.mappers.PassportMapper;
import com.example.Residences.repositories.PassportRepository;
import org.springframework.stereotype.Service;

@Service
public class PassportService extends Generic_ServiceImpl<Passport,String, PassportDto, PassportRepository, PassportMapper> implements Generic_Service<PassportDto,String> {

    public PassportService(PassportRepository repository, PassportMapper mapper) {
        super(repository, mapper);
    }
}
