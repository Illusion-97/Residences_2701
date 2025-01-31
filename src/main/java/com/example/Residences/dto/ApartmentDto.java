package com.example.Residences.dto;

import com.example.Residences.entities.residences.Address;
import com.example.Residences.entities.residences.Apartment;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link Apartment}
 */
@Value
public class ApartmentDto implements Serializable {
    AddressDto address;
    List<Integer> pieceSurface;

    /**
     * DTO for {@link Address}
     */
    @Value
    public static class AddressDto implements Serializable {
        int cp;
        String line1;
        String line2;
    }
}
