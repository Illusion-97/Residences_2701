package com.example.Residences.controllers;

import com.example.Residences.dto.PassportDto;
import com.example.Residences.entities.identification.Passport;
import com.example.Residences.generic.Generic_Controller;
import com.example.Residences.services.PassportService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("passports")
public class PassportController extends Generic_Controller<PassportDto,String, PassportService> {
    public PassportController(PassportService service) {
        super(service);
    }
}
