package com.example.Residences.mappers;

import com.example.Residences.dto.PassportDto;
import com.example.Residences.entities.identification.Passport;
import com.example.Residences.generic.Generic_Mapper;
import org.mapstruct.Mapper;

@Mapper
public interface PassportMapper extends Generic_Mapper<Passport, PassportDto> {

}
