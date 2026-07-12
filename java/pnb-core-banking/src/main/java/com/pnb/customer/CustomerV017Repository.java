package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV017Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV017> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV017.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV017> findAll() {
        return em.createQuery("SELECT e FROM CustomerV017 e").getResultList();
    }

    @Transactional
    public CustomerV017 save(CustomerV017 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV017 entity = em.find(CustomerV017.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
