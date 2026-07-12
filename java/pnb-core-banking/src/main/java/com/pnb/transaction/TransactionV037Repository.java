package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV037Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV037> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV037.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV037> findAll() {
        return em.createQuery("SELECT e FROM TransactionV037 e").getResultList();
    }

    @Transactional
    public TransactionV037 save(TransactionV037 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV037 entity = em.find(TransactionV037.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
