package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV024Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV024> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV024.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV024> findAll() {
        return em.createQuery("SELECT e FROM TransactionV024 e").getResultList();
    }

    @Transactional
    public TransactionV024 save(TransactionV024 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV024 entity = em.find(TransactionV024.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
