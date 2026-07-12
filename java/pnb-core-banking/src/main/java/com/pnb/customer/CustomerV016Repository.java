package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV016Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV016> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV016.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV016> findAll() {
        return em.createQuery("SELECT e FROM CustomerV016 e").getResultList();
    }

    @Transactional
    public CustomerV016 save(CustomerV016 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV016 entity = em.find(CustomerV016.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
