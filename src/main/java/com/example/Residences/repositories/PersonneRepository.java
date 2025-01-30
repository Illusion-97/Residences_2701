package com.example.Residences.repositories;

import com.example.Residences.entities.identification.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
}
