package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {

    List<Persona> searchByNombreOrApellido(String filtro);
}
