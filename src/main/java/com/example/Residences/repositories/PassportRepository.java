package com.example.Residences.repositories;

import com.example.Residences.entities.identification.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, String> {
}
