package com.example.Residences.services;

import com.example.Residences.entities.residences.Address;
import com.example.Residences.entities.residences.Farm;
import com.example.Residences.generic.Generic_Service;
import com.example.Residences.generic.Generic_ServiceImpl;
import com.example.Residences.repositories.FarmRepository;
import org.springframework.stereotype.Service;

@Service
public class FarmService extends Generic_ServiceImpl<Farm, Address, FarmRepository> implements Generic_Service<Farm,Address> {
    public FarmService(FarmRepository repository) {
        super(repository);
    }
}
