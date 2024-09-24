package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Audited
public class Localidad extends Base<Long> {

    private String denominacion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    Domicilio domicilio;
}
