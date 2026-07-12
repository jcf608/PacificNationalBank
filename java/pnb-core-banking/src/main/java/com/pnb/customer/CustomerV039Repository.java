package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV039Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV039> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV039.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV039> findAll() {
        return em.createQuery("SELECT e FROM CustomerV039 e").getResultList();
    }

    @Transactional
    public CustomerV039 save(CustomerV039 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV039 entity = em.find(CustomerV039.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
