package com.example.Residences.entities.identification;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class IdentityCard extends IdForm {
    private String puceId;
}
