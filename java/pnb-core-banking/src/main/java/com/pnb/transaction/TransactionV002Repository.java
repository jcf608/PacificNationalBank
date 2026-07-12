package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV002Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV002> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV002.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV002> findAll() {
        return em.createQuery("SELECT e FROM TransactionV002 e").getResultList();
    }

    @Transactional
    public TransactionV002 save(TransactionV002 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV002 entity = em.find(TransactionV002.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
