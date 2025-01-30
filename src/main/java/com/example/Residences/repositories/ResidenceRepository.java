package com.example.Residences.repositories;

import com.example.Residences.entities.residences.Residence;
import com.example.Residences.entities.residences.ResidenceId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidenceRepository extends JpaRepository<Residence, ResidenceId> {
}
