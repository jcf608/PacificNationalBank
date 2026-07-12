package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV021Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV021> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV021.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV021> findAll() {
        return em.createQuery("SELECT e FROM CustomerV021 e").getResultList();
    }

    @Transactional
    public CustomerV021 save(CustomerV021 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV021 entity = em.find(CustomerV021.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
