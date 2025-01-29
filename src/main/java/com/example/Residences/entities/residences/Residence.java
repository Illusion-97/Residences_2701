package com.example.Residences.entities.residences;

import com.example.Residences.entities.identification.Personne;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
@Entity
@IdClass(ResidenceId.class) // Préciser une classe déclarative décrivant la constitution de la clé primaire
public class Residence {
    private boolean main;
    @Id
    @ManyToOne
    private House house;
    @Id
    @ManyToOne
    private Personne resident;
}
