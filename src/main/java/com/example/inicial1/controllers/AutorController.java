package com.example.inicial1.controllers;

import com.example.inicial1.controllers.impl.BaseControllerImpl;
import com.example.inicial1.entities.Autor;
import com.example.inicial1.services.impl.AutorServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {

    public AutorController(AutorServiceImpl service) {
        super(service);
    }
}