package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV031Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV031> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV031.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV031> findAll() {
        return em.createQuery("SELECT e FROM CustomerV031 e").getResultList();
    }

    @Transactional
    public CustomerV031 save(CustomerV031 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV031 entity = em.find(CustomerV031.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
