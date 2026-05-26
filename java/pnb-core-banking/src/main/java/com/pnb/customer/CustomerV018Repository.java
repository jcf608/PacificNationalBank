package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV018Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV018> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV018.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV018> findAll() {
        return em.createQuery("SELECT e FROM CustomerV018 e").getResultList();
    }

    @Transactional
    public CustomerV018 save(CustomerV018 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV018 entity = em.find(CustomerV018.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
