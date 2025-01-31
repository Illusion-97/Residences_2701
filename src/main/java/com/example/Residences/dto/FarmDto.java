package com.example.Residences.dto;

import com.example.Residences.entities.residences.Address;
import com.example.Residences.entities.residences.Farm;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Farm}
 */
@Value
public class FarmDto implements Serializable {
    AddressDto address;
    int livestock;

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
