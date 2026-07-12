package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV023Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV023> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV023.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV023> findAll() {
        return em.createQuery("SELECT e FROM CustomerV023 e").getResultList();
    }

    @Transactional
    public CustomerV023 save(CustomerV023 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV023 entity = em.find(CustomerV023.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
