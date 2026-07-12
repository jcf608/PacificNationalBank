package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV012Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV012> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV012.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV012> findAll() {
        return em.createQuery("SELECT e FROM CustomerV012 e").getResultList();
    }

    @Transactional
    public CustomerV012 save(CustomerV012 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV012 entity = em.find(CustomerV012.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
