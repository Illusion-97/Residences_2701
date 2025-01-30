package com.example.Residences.entities.residences;

import com.example.Residences.entities.identification.Personne;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class Residence {
    private boolean main;
    @EmbeddedId
    private ResidenceId id;
}
