package com.example.Residences.entities.residences;

import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link Residence}
 */
@Value
public class ResidenceDto implements Serializable {
    boolean main;
    long idResidentId;
    int idHouseAddressCp;
    String idHouseAddressLine1;
    String idHouseAddressLine2;
    List<Integer> idHousePieceSurface;
}
