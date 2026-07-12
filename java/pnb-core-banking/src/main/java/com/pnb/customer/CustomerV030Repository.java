package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV030Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV030> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV030.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV030> findAll() {
        return em.createQuery("SELECT e FROM CustomerV030 e").getResultList();
    }

    @Transactional
    public CustomerV030 save(CustomerV030 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV030 entity = em.find(CustomerV030.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
