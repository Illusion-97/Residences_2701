package com.example.Residences.entities.identification;

import com.example.Residences.entities.residences.Residence;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(fluent = true)
@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Embedded
    private Identity identity;

    @OneToMany(mappedBy = "resident")
    private List<Residence> residences;
}
