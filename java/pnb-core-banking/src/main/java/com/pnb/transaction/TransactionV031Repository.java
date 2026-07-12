package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV031Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV031> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV031.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV031> findAll() {
        return em.createQuery("SELECT e FROM TransactionV031 e").getResultList();
    }

    @Transactional
    public TransactionV031 save(TransactionV031 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV031 entity = em.find(TransactionV031.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
