package com.example.Residences.repositories;

import com.example.Residences.entities.identification.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

    @Query("FROM Personne WHERE identity.firstName LIKE %:prenom%")
    List<Personne> byPrenom(String prenom);

    @Query("FROM Personne person JOIN person.identity.idForms form WHERE form.UUID = :uuid")
    Optional<Personne> byIdFormUuid(String uuid);

    Optional<Personne> findByIdentity_IdForms_UUID(String uuid);

    /*@Query("FROM Personne person JOIN person.identity.idForms form WHERE form.class = IdentityCard AND cast(form as IdentityCard).puceId = :puceId")
    Optional<Personne> byPuceID(String puceId);*/
}
