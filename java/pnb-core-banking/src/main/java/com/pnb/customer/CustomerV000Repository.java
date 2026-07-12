package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV000Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV000> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV000.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV000> findAll() {
        return em.createQuery("SELECT e FROM CustomerV000 e").getResultList();
    }

    @Transactional
    public CustomerV000 save(CustomerV000 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV000 entity = em.find(CustomerV000.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
