package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV028Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV028> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV028.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV028> findAll() {
        return em.createQuery("SELECT e FROM CustomerV028 e").getResultList();
    }

    @Transactional
    public CustomerV028 save(CustomerV028 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV028 entity = em.find(CustomerV028.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
