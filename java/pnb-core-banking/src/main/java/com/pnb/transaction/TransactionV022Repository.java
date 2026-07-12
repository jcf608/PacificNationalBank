package com.pnb.transaction;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class TransactionV022Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<TransactionV022> findById(Long id) {
        return Optional.ofNullable(em.find(TransactionV022.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<TransactionV022> findAll() {
        return em.createQuery("SELECT e FROM TransactionV022 e").getResultList();
    }

    @Transactional
    public TransactionV022 save(TransactionV022 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        TransactionV022 entity = em.find(TransactionV022.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
