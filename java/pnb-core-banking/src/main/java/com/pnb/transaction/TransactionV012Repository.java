package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV012Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV012> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV012.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV012> findAll() {
        return em.createQuery("SELECT e FROM TransactionV012 e").getResultList();
    }

    @Transactional
    public TransactionV012 save(TransactionV012 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV012 entity = em.find(TransactionV012.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
