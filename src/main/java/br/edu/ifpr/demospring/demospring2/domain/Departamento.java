package br.edu.ifpr.demospring.demospring2.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "departamentos")
public class Departamento extends AbstractEntity <Long> {

    @Column(nullable = false, unique = true, length = 60)
    private String nome;

}
