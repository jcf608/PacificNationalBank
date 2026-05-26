package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV036Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV036> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV036.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV036> findAll() {
        return em.createQuery("SELECT e FROM CustomerV036 e").getResultList();
    }

    @Transactional
    public CustomerV036 save(CustomerV036 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV036 entity = em.find(CustomerV036.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
