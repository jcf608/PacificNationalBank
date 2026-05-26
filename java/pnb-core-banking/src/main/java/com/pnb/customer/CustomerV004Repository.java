package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV004Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV004> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV004.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV004> findAll() {
        return em.createQuery("SELECT e FROM CustomerV004 e").getResultList();
    }

    @Transactional
    public CustomerV004 save(CustomerV004 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV004 entity = em.find(CustomerV004.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
