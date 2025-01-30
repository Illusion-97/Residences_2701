package com.example.Residences.repositories;

import com.example.Residences.entities.identification.IdentityCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentityCardRepository extends JpaRepository<IdentityCard, String> {
}
