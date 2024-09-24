package com.example.inicial1.entities;

import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Audited
public class Autor extends Base<Long> {

    private String nombre;

    private String apellido;

    private String biografia;
}
