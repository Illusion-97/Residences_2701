package com.example.Residences.controllers;

import com.example.Residences.entities.identification.IdentityCard;
import com.example.Residences.generic.Generic_Controller;
import com.example.Residences.services.IdentityCardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("identityCards")
public class IdCardController extends Generic_Controller<IdentityCard,String, IdentityCardService> {
    public IdCardController(IdentityCardService service) {
        super(service);
    }
}
