package com.example.Residences.mappers;

import com.example.Residences.entities.identification.Personne;
import com.example.Residences.dto.PersonneDto;
import com.example.Residences.generic.Generic_Mapper;
import org.mapstruct.*;

@Mapper
public interface PersonneMapper extends Generic_Mapper<Personne, PersonneDto> {

}
