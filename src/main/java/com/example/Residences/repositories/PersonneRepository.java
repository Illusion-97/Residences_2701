package com.example.Residences.repositories;

import com.example.Residences.entities.identification.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonneRepository extends JpaRepository<Personne, Long> {
}
