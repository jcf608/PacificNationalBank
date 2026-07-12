package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV006Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV006> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV006.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV006> findAll() {
        return em.createQuery("SELECT e FROM CustomerV006 e").getResultList();
    }

    @Transactional
    public CustomerV006 save(CustomerV006 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV006 entity = em.find(CustomerV006.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
