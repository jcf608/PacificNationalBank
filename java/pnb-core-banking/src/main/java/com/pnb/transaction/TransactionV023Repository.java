package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV023Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV023> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV023.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV023> findAll() {
        return em.createQuery("SELECT e FROM TransactionV023 e").getResultList();
    }

    @Transactional
    public TransactionV023 save(TransactionV023 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV023 entity = em.find(TransactionV023.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
