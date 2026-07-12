package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV008Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV008> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV008.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV008> findAll() {
        return em.createQuery("SELECT e FROM CustomerV008 e").getResultList();
    }

    @Transactional
    public CustomerV008 save(CustomerV008 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV008 entity = em.find(CustomerV008.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
