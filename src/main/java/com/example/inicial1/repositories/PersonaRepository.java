package com.example.inicial1.repositories;

import com.example.inicial1.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    @Query(value = "SELECT * FROM Persona p " +
            "WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%", nativeQuery = true)
    List<Persona> searchByNombreOrApellido(@Param("filtro") String filtro);
}