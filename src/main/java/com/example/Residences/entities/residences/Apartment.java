package com.example.Residences.entities.residences;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(fluent = true)
@Entity
public class Apartment extends House {
    @ElementCollection
    private List<Integer> pieceSurface;
}
