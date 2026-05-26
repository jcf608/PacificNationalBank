package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV015Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV015> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV015.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV015> findAll() {
        return em.createQuery("SELECT e FROM CustomerV015 e").getResultList();
    }

    @Transactional
    public CustomerV015 save(CustomerV015 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV015 entity = em.find(CustomerV015.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
