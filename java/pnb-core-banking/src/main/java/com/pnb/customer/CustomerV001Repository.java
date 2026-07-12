package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV001Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV001> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV001.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV001> findAll() {
        return em.createQuery("SELECT e FROM CustomerV001 e").getResultList();
    }

    @Transactional
    public CustomerV001 save(CustomerV001 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV001 entity = em.find(CustomerV001.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
