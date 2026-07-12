package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV010Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV010> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV010.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV010> findAll() {
        return em.createQuery("SELECT e FROM CustomerV010 e").getResultList();
    }

    @Transactional
    public CustomerV010 save(CustomerV010 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV010 entity = em.find(CustomerV010.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
