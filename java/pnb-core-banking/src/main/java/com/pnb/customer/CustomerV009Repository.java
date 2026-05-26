package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV009Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV009> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV009.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV009> findAll() {
        return em.createQuery("SELECT e FROM CustomerV009 e").getResultList();
    }

    @Transactional
    public CustomerV009 save(CustomerV009 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV009 entity = em.find(CustomerV009.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
