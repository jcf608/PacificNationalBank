package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV009Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV009> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV009.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV009> findAll() {
        return em.createQuery("SELECT e FROM TransactionV009 e").getResultList();
    }

    @Transactional
    public TransactionV009 save(TransactionV009 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV009 entity = em.find(TransactionV009.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
