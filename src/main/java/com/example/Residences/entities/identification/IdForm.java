package com.example.Residences.entities.identification;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Getter
@Setter
@Accessors(fluent = true)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@Table(name = "identification")
public class IdForm {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String UUID;
    private LocalDate issuedAt;
}
