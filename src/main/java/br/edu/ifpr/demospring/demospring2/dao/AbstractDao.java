package br.edu.ifpr.demospring.demospring2.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class AbstractDao<T, PK extends Serializable> {

    //Implementação para identificar qual classe será utilizada para realizar, por exemplo, uma listagem
    @SuppressWarnings("unchecked")
    private final Class<T> entityClass =
            (Class<T>) ( (ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    @PersistenceContext
    private EntityManager entityManager;

    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public void save (T entity){
        entityManager.persist(entity);
    }

    //Método atualizar
    public void update(T entity) {

        entityManager.merge(entity);
    }

    //Método excluir
    public void delete(PK id) {

        entityManager.remove(entityManager.getReference(entityClass, id));
    }

    //Método buscar por id
    public T findById(PK id) {

        return entityManager.find(entityClass, id);
    }

    //Método listar todos
    public List<T> findAll() {

        return entityManager
                .createQuery("from " + entityClass.getSimpleName(), entityClass)
                .getResultList();
    }


}
    


