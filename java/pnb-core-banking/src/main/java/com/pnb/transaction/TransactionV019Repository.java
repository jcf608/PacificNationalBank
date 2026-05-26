package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV019Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV019> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV019.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV019> findAll() {
        return em.createQuery("SELECT e FROM TransactionV019 e").getResultList();
    }

    @Transactional
    public TransactionV019 save(TransactionV019 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV019 entity = em.find(TransactionV019.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
