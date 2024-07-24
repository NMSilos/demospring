package br.edu.ifpr.demospring.demospring2.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@MappedSuperclass
public abstract class AbstractEntity <ID extends Serializable> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

}
