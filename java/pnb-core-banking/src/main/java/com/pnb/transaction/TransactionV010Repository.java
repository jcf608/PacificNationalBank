package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV010Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV010> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV010.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV010> findAll() {
        return em.createQuery("SELECT e FROM TransactionV010 e").getResultList();
    }

    @Transactional
    public TransactionV010 save(TransactionV010 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV010 entity = em.find(TransactionV010.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
