package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV004Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV004> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV004.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV004> findAll() {
        return em.createQuery("SELECT e FROM TransactionV004 e").getResultList();
    }

    @Transactional
    public TransactionV004 save(TransactionV004 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV004 entity = em.find(TransactionV004.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
