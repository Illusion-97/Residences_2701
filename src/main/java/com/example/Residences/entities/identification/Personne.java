package com.example.Residences.entities.identification;

import com.example.Residences.entities.residences.Residence;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Embedded
    private Identity identity;

    //@JsonIgnore pratique mais indique généralement un défaut de conception
    @OneToMany(mappedBy = "id.resident")
    private List<Residence> residences;
}
