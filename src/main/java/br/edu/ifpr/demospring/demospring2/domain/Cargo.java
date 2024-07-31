package br.edu.ifpr.demospring.demospring2.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "cargos")
public class Cargo extends AbstractEntity <Long> {

    @Column(nullable = false, unique = true, length = 60)
    private String nome;

    @JoinColumn(name = "fk_id_departamento")
    @ManyToOne
    private Departamento departamento;

}
