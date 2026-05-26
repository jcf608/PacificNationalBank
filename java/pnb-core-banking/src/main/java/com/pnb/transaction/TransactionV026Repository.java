package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV026Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV026> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV026.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV026> findAll() {
        return em.createQuery("SELECT e FROM TransactionV026 e").getResultList();
    }

    @Transactional
    public TransactionV026 save(TransactionV026 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV026 entity = em.find(TransactionV026.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
