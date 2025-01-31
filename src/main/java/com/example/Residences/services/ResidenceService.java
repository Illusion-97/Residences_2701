package com.example.Residences.services;

import com.example.Residences.dto.ResidenceDto;
import com.example.Residences.entities.residences.ResidenceId;
import com.example.Residences.entities.residences.Residence;
import com.example.Residences.generic.Generic_Service;
import com.example.Residences.generic.Generic_ServiceImpl;
import com.example.Residences.mappers.ResidenceMapper;
import com.example.Residences.repositories.ResidenceRepository;
import org.springframework.stereotype.Service;

@Service
public class ResidenceService extends Generic_ServiceImpl<Residence, ResidenceId, ResidenceDto, ResidenceRepository, ResidenceMapper> implements Generic_Service<ResidenceDto,ResidenceId> {

    public ResidenceService(ResidenceRepository repository, ResidenceMapper mapper) {
        super(repository, mapper);
    }
}
