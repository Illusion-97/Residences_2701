package com.example.Residences.dto;

import com.example.Residences.entities.residences.Address;
import com.example.Residences.entities.residences.Apartment;
import com.example.Residences.entities.residences.Residence;
import com.example.Residences.entities.residences.ResidenceId;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link Residence}
 */
@Value
public class ResidenceDto implements Serializable {
    boolean main;
    ResidenceIdDto id;

    /**
     * DTO for {@link ResidenceId}
     */
    @Value
    public static class ResidenceIdDto implements Serializable {
        PersonneDto resident;
        ApartmentDto1 house;

        /**
         * DTO for {@link com.example.Residences.entities.identification.Personne}
         */
        @Value
        public static class PersonneDto implements Serializable {
            long id;
            IdentityDto identity;

            /**
             * DTO for {@link com.example.Residences.entities.identification.Identity}
             */
            @Value
            public static class IdentityDto implements Serializable {
                String firstName;
                String lastName;
                LocalDateTime birthDate;
            }
        }

        /**
         * DTO for {@link Apartment}
         */
        @Value
        public static class ApartmentDto1 implements Serializable {
            AddressDto address;

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
    }
}
