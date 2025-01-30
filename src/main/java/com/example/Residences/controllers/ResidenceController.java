package com.example.Residences.controllers;

import com.example.Residences.entities.residences.Residence;
import com.example.Residences.entities.residences.ResidenceDto;
import com.example.Residences.entities.residences.ResidenceId;
import com.example.Residences.generic.Generic_ObjectId_Controller;
import com.example.Residences.services.ResidenceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("residences")
public class ResidenceController extends Generic_ObjectId_Controller<ResidenceDto, ResidenceId, ResidenceService> {
    public ResidenceController(ResidenceService service) {
        super(service);
    }
}
