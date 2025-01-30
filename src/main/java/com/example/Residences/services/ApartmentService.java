package com.example.Residences.services;

import com.example.Residences.entities.residences.Address;
import com.example.Residences.entities.residences.Apartment;
import com.example.Residences.generic.Generic_Service;
import com.example.Residences.generic.Generic_ServiceImpl;
import com.example.Residences.repositories.ApartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class ApartmentService extends Generic_ServiceImpl<Apartment, Address,  Apartment, ApartmentRepository> implements Generic_Service<Apartment,Address> {
    public ApartmentService(ApartmentRepository repository) {
        super(repository);
    }
}
