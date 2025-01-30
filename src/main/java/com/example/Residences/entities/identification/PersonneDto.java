package com.example.Residences.entities.identification;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO for {@link Personne}
 */
@Value
public class PersonneDto implements Serializable {
    long id;
    String identityFirstName;
    String identityLastName;
    LocalDateTime identityBirthDate;
    List<ResidenceDto> residences;

    /**
     * DTO for {@link com.example.Residences.entities.residences.Residence}
     */
    @Value
    public static class ResidenceDto implements Serializable {
        boolean main;
        ResidenceIdDto id;

        /**
         * DTO for {@link com.example.Residences.entities.residences.ResidenceId}
         */
        @Value
        public static class ResidenceIdDto implements Serializable {
            ApartmentDto house;

            /**
             * DTO for {@link com.example.Residences.entities.residences.Apartment}
             */
            @Value
            public static class ApartmentDto implements Serializable {
                AddressDto address;
                List<Integer> pieceSurface;

                /**
                 * DTO for {@link com.example.Residences.entities.residences.Address}
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
}
