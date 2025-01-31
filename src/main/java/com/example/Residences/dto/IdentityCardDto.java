package com.example.Residences.dto;

import com.example.Residences.entities.identification.IdentityCard;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link IdentityCard}
 */
@Value
public class IdentityCardDto implements Serializable {
    String UUID;
    LocalDate issuedAt;
    String puceId;
}
