package com.example.Residences.services;

import com.example.Residences.entities.residences.ResidenceId;
import com.example.Residences.entities.residences.Residence;
import com.example.Residences.generic.Generic_Service;
import com.example.Residences.generic.Generic_ServiceImpl;
import com.example.Residences.repositories.ResidenceRepository;
import org.springframework.stereotype.Service;

@Service
public class ResidenceService extends Generic_ServiceImpl<Residence, ResidenceId, ResidenceRepository> implements Generic_Service<Residence,ResidenceId> {
    public ResidenceService(ResidenceRepository repository) {
        super(repository);
    }
}
