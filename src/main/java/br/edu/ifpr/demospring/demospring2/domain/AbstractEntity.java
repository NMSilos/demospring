package br.edu.ifpr.demospring.demospring2.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class AbstractEntity <ID extends Serializable> implements Serializable {
    private ID id;
}
