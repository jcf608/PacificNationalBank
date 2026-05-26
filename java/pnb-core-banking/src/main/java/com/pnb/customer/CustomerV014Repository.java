package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV014Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV014> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV014.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV014> findAll() {
        return em.createQuery("SELECT e FROM CustomerV014 e").getResultList();
    }

    @Transactional
    public CustomerV014 save(CustomerV014 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV014 entity = em.find(CustomerV014.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
