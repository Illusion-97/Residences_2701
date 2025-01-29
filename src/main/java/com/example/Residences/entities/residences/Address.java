package com.example.Residences.entities.residences;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
@Embeddable
public class Address {
    private int cp;
    private String line1;
    private String line2;
}
