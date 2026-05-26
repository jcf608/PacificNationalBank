package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV011Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV011> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV011.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV011> findAll() {
        return em.createQuery("SELECT e FROM CustomerV011 e").getResultList();
    }

    @Transactional
    public CustomerV011 save(CustomerV011 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV011 entity = em.find(CustomerV011.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
