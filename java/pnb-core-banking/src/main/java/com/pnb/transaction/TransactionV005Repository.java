package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV005Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV005> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV005.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV005> findAll() {
        return em.createQuery("SELECT e FROM TransactionV005 e").getResultList();
    }

    @Transactional
    public TransactionV005 save(TransactionV005 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV005 entity = em.find(TransactionV005.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
