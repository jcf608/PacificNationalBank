package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV032Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV032> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV032.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV032> findAll() {
        return em.createQuery("SELECT e FROM TransactionV032 e").getResultList();
    }

    @Transactional
    public TransactionV032 save(TransactionV032 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV032 entity = em.find(TransactionV032.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
