package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV024Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV024> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV024.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV024> findAll() {
        return em.createQuery("SELECT e FROM CustomerV024 e").getResultList();
    }

    @Transactional
    public CustomerV024 save(CustomerV024 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV024 entity = em.find(CustomerV024.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
