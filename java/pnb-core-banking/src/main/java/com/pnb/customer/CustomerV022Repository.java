package com.pnb.customer;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerV022Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CustomerV022> findById(Long id) {
        return Optional.ofNullable(em.find(CustomerV022.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CustomerV022> findAll() {
        return em.createQuery("SELECT e FROM CustomerV022 e").getResultList();
    }

    @Transactional
    public CustomerV022 save(CustomerV022 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CustomerV022 entity = em.find(CustomerV022.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
