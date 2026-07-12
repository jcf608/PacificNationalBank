package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV027Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV027> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV027.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV027> findAll() {
        return em.createQuery("SELECT e FROM CustomerV027 e").getResultList();
    }

    @Transactional
    public CustomerV027 save(CustomerV027 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV027 entity = em.find(CustomerV027.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
