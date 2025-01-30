package com.example.Residences.entities.residences;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class House {
    @EmbeddedId
    private Address address;
}
