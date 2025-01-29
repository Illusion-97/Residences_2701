package com.example.Residences.entities.residences;

import com.example.Residences.entities.identification.Personne;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public class ResidenceId {
    private Personne resident;
    private House house;
}
