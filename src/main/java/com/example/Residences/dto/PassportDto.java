package com.example.Residences.dto;

import com.example.Residences.entities.identification.Passport;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * DTO for {@link Passport}
 */
@Value
public class PassportDto implements Serializable {
    String UUID;
    LocalDate issuedAt;
    List<String> travels;
}
