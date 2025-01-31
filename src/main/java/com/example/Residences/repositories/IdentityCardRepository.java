package com.example.Residences.repositories;

import com.example.Residences.entities.identification.IdentityCard;
import com.example.Residences.entities.identification.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IdentityCardRepository extends JpaRepository<IdentityCard, String> {

    @Query("SELECT p FROM IdentityCard id JOIN id.owner p WHERE id.puceId = :puceId")
    Optional<Personne> byPuceId(String puceId);
}
