package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV013Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV013> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV013.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV013> findAll() {
        return em.createQuery("SELECT e FROM CustomerV013 e").getResultList();
    }

    @Transactional
    public CustomerV013 save(CustomerV013 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV013 entity = em.find(CustomerV013.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
