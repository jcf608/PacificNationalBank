package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV033Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV033> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV033.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV033> findAll() {
        return em.createQuery("SELECT e FROM TransactionV033 e").getResultList();
    }

    @Transactional
    public TransactionV033 save(TransactionV033 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV033 entity = em.find(TransactionV033.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
