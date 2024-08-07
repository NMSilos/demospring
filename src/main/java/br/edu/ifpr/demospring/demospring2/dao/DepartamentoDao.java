package br.edu.ifpr.demospring.demospring2.dao;

import br.edu.ifpr.demospring.demospring2.domain.Departamento;

import java.util.List;

public interface DepartamentoDao {

    void save(Departamento departamento);
    void update(Departamento departamento);
    void delete(Long id);
    Departamento findById(Long id);
    List<Departamento> findAll();
}
