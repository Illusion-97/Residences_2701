package com.example.Residences.mappers;

import com.example.Residences.dto.IdentityCardDto;
import com.example.Residences.entities.identification.IdentityCard;
import com.example.Residences.generic.Generic_Mapper;
import org.mapstruct.Mapper;

@Mapper
public interface IdentityCardMapper extends Generic_Mapper<IdentityCard, IdentityCardDto> {

}
