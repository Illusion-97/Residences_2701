package com.example.Residences.entities.residences;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
@Entity
public class Farm extends House {
    private int livestock;
}
