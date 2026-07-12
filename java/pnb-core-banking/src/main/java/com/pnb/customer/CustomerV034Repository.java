package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV034Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV034> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV034.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV034> findAll() {
        return em.createQuery("SELECT e FROM CustomerV034 e").getResultList();
    }

    @Transactional
    public CustomerV034 save(CustomerV034 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV034 entity = em.find(CustomerV034.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
