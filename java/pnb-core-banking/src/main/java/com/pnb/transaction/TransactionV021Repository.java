package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV021Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV021> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV021.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV021> findAll() {
        return em.createQuery("SELECT e FROM TransactionV021 e").getResultList();
    }

    @Transactional
    public TransactionV021 save(TransactionV021 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV021 entity = em.find(TransactionV021.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
