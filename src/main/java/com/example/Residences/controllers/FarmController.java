package com.example.Residences.controllers;

import com.example.Residences.dto.FarmDto;
import com.example.Residences.entities.residences.Address;
import com.example.Residences.entities.residences.Farm;
import com.example.Residences.generic.Generic_ObjectId_Controller;
import com.example.Residences.services.FarmService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("farms")
public class FarmController extends Generic_ObjectId_Controller<FarmDto, Address, FarmService> {
    public FarmController(FarmService service) {
        super(service);
    }
}
