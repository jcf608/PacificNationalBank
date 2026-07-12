package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV015Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV015> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV015.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV015> findAll() {
        return em.createQuery("SELECT e FROM TransactionV015 e").getResultList();
    }

    @Transactional
    public TransactionV015 save(TransactionV015 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV015 entity = em.find(TransactionV015.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
