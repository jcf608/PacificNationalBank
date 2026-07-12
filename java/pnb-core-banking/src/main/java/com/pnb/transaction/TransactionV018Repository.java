package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV018Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV018> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV018.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV018> findAll() {
        return em.createQuery("SELECT e FROM TransactionV018 e").getResultList();
    }

    @Transactional
    public TransactionV018 save(TransactionV018 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV018 entity = em.find(TransactionV018.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
