package com.example.inicial1.controllers;

import com.example.inicial1.controllers.impl.BaseControllerImpl;
import com.example.inicial1.entities.Persona;
import com.example.inicial1.services.impl.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {

    public PersonaController(PersonaServiceImpl service) {
        super(service);
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchByNombreOrApellido(@RequestParam String filtro) {
        try {
            return ResponseEntity.ok(service.searchByNombreOrApellido(filtro));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente más tarde\"}");
        }
    }
}