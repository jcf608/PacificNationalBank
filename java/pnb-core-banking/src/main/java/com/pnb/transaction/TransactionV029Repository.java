package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV029Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV029> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV029.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV029> findAll() {
        return em.createQuery("SELECT e FROM TransactionV029 e").getResultList();
    }

    @Transactional
    public TransactionV029 save(TransactionV029 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV029 entity = em.find(TransactionV029.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
