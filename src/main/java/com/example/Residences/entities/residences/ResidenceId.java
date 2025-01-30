package com.example.Residences.entities.residences;

import com.example.Residences.entities.identification.Personne;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Embeddable
public class ResidenceId {
    @ManyToOne
    private Personne resident;
    @ManyToOne
    private Apartment house;
}
