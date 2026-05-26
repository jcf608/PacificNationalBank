package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV025Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV025> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV025.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV025> findAll() {
        return em.createQuery("SELECT e FROM CustomerV025 e").getResultList();
    }

    @Transactional
    public CustomerV025 save(CustomerV025 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV025 entity = em.find(CustomerV025.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
