package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV014Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV014> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV014.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV014> findAll() {
        return em.createQuery("SELECT e FROM TransactionV014 e").getResultList();
    }

    @Transactional
    public TransactionV014 save(TransactionV014 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV014 entity = em.find(TransactionV014.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
