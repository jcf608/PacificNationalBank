package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV032Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV032> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV032.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV032> findAll() {
        return em.createQuery("SELECT e FROM CustomerV032 e").getResultList();
    }

    @Transactional
    public CustomerV032 save(CustomerV032 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV032 entity = em.find(CustomerV032.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
