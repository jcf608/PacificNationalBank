package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV037Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV037> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV037.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV037> findAll() {
        return em.createQuery("SELECT e FROM CustomerV037 e").getResultList();
    }

    @Transactional
    public CustomerV037 save(CustomerV037 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV037 entity = em.find(CustomerV037.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
