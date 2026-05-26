package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV036Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV036> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV036.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV036> findAll() {
        return em.createQuery("SELECT e FROM TransactionV036 e").getResultList();
    }

    @Transactional
    public TransactionV036 save(TransactionV036 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV036 entity = em.find(TransactionV036.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
