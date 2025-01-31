package com.example.Residences.mappers;

import com.example.Residences.dto.FarmDto;
import com.example.Residences.entities.residences.Farm;
import com.example.Residences.generic.Generic_Mapper;
import org.mapstruct.Mapper;

@Mapper
public interface FarmMapper extends Generic_Mapper<Farm, FarmDto> {

}
