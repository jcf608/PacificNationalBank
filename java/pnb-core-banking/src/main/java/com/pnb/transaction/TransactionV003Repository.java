package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV003Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV003> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV003.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV003> findAll() {
        return em.createQuery("SELECT e FROM TransactionV003 e").getResultList();
    }

    @Transactional
    public TransactionV003 save(TransactionV003 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV003 entity = em.find(TransactionV003.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
