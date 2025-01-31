package com.example.Residences.mappers;

import com.example.Residences.dto.ApartmentDto;
import com.example.Residences.entities.residences.Apartment;
import com.example.Residences.generic.Generic_Mapper;
import org.mapstruct.Mapper;

@Mapper
public interface ApartmentMapper extends Generic_Mapper<Apartment, ApartmentDto> {

}
