package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV019Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV019> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV019.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV019> findAll() {
        return em.createQuery("SELECT e FROM CustomerV019 e").getResultList();
    }

    @Transactional
    public CustomerV019 save(CustomerV019 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV019 entity = em.find(CustomerV019.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
