package com.example.Residences.mappers;

import com.example.Residences.dto.ResidenceDto;
import com.example.Residences.entities.residences.Residence;
import com.example.Residences.generic.Generic_Mapper;
import org.mapstruct.Mapper;

@Mapper
public interface ResidenceMapper extends Generic_Mapper<Residence, ResidenceDto> {

}
