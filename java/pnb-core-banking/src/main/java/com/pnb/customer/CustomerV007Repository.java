package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV007Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV007> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV007.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV007> findAll() {
        return em.createQuery("SELECT e FROM CustomerV007 e").getResultList();
    }

    @Transactional
    public CustomerV007 save(CustomerV007 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV007 entity = em.find(CustomerV007.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
