package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV038Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV038> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV038.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV038> findAll() {
        return em.createQuery("SELECT e FROM CustomerV038 e").getResultList();
    }

    @Transactional
    public CustomerV038 save(CustomerV038 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV038 entity = em.find(CustomerV038.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
