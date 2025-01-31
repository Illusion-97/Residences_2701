package com.example.Residences.services;

import com.example.Residences.dto.FarmDto;
import com.example.Residences.entities.residences.Address;
import com.example.Residences.entities.residences.Farm;
import com.example.Residences.generic.Generic_Service;
import com.example.Residences.generic.Generic_ServiceImpl;
import com.example.Residences.mappers.FarmMapper;
import com.example.Residences.repositories.FarmRepository;
import org.springframework.stereotype.Service;

@Service
public class FarmService extends Generic_ServiceImpl<Farm, Address, FarmDto, FarmRepository, FarmMapper> implements Generic_Service<FarmDto,Address> {

    public FarmService(FarmRepository repository, FarmMapper mapper) {
        super(repository, mapper);
    }
}
