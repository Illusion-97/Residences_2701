package com.example.Residences.repositories;

import com.example.Residences.entities.residences.Address;
import com.example.Residences.entities.residences.Farm;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FarmRepository extends JpaRepository<Farm, Address> {
}
