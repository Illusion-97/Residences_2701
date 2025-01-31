package com.example.Residences.controllers;

import com.example.Residences.dto.ApartmentDto;
import com.example.Residences.entities.residences.Address;
import com.example.Residences.generic.Generic_ObjectId_Controller;
import com.example.Residences.services.ApartmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apartments")
public class ApartmentController extends Generic_ObjectId_Controller<ApartmentDto, Address, ApartmentService> {
    public ApartmentController(ApartmentService service) {
        super(service);
    }
}
