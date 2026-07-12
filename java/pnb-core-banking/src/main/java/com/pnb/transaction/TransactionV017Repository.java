package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV017Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV017> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV017.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV017> findAll() {
        return em.createQuery("SELECT e FROM TransactionV017 e").getResultList();
    }

    @Transactional
    public TransactionV017 save(TransactionV017 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV017 entity = em.find(TransactionV017.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
