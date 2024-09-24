package com.example.inicial1.controllers;

import com.example.inicial1.controllers.impl.BaseControllerImpl;
import com.example.inicial1.entities.Localidad;
import com.example.inicial1.services.impl.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {

    public LocalidadController(LocalidadServiceImpl service) {
        super(service);
    }
}