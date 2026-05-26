package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV003Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV003> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV003.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV003> findAll() {
        return em.createQuery("SELECT e FROM CustomerV003 e").getResultList();
    }

    @Transactional
    public CustomerV003 save(CustomerV003 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV003 entity = em.find(CustomerV003.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
