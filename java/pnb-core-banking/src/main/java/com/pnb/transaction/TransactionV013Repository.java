package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV013Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV013> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV013.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV013> findAll() {
        return em.createQuery("SELECT e FROM TransactionV013 e").getResultList();
    }

    @Transactional
    public TransactionV013 save(TransactionV013 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV013 entity = em.find(TransactionV013.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
