package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV020Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV020> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV020.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV020> findAll() {
        return em.createQuery("SELECT e FROM CustomerV020 e").getResultList();
    }

    @Transactional
    public CustomerV020 save(CustomerV020 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV020 entity = em.find(CustomerV020.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
