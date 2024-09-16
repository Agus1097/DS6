package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import com.example.inicial1.repositories.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class PersonaService implements BaseService<Persona> {

    private final PersonaRepository personaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> findAll() throws Exception {
        try {
            return personaRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Persona findById(Long id) throws Exception {
        try {
            return personaRepository.findById(id).orElseThrow();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona save(Persona persona) throws Exception {
        try {
            return personaRepository.save(persona);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona update(Long id, Persona persona) throws Exception {
        try {
            Persona personaActualizada = this.findById(id);
            personaActualizada = Persona.builder()
                    .id(personaActualizada.getId())
                    .nombre(Objects.nonNull(persona.getNombre()) ? persona.getNombre() : personaActualizada.getNombre())
                    .apellido(Objects.nonNull(persona.getApellido()) ? persona.getApellido() : personaActualizada.getApellido())
                    .build();

            return personaRepository.save(personaActualizada);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public void delete(Long id) throws Exception {
        try {
            personaRepository.deleteById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
