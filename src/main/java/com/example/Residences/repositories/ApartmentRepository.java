package com.example.Residences.repositories;

import com.example.Residences.entities.residences.Address;
import com.example.Residences.entities.residences.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Address> {
}
