package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV011Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV011> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV011.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV011> findAll() {
        return em.createQuery("SELECT e FROM TransactionV011 e").getResultList();
    }

    @Transactional
    public TransactionV011 save(TransactionV011 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV011 entity = em.find(TransactionV011.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
