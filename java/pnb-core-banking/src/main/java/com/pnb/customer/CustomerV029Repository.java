package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV029Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV029> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV029.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV029> findAll() {
        return em.createQuery("SELECT e FROM CustomerV029 e").getResultList();
    }

    @Transactional
    public CustomerV029 save(CustomerV029 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV029 entity = em.find(CustomerV029.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
