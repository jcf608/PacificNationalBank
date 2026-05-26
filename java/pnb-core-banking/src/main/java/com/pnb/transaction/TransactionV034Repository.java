package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV034Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV034> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV034.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV034> findAll() {
        return em.createQuery("SELECT e FROM TransactionV034 e").getResultList();
    }

    @Transactional
    public TransactionV034 save(TransactionV034 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV034 entity = em.find(TransactionV034.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
