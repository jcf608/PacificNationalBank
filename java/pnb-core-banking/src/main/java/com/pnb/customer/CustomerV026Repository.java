package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV026Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV026> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV026.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV026> findAll() {
        return em.createQuery("SELECT e FROM CustomerV026 e").getResultList();
    }

    @Transactional
    public CustomerV026 save(CustomerV026 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV026 entity = em.find(CustomerV026.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
