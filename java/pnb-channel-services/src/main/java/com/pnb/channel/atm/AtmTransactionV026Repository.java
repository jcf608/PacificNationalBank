package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV026Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV026> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV026.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV026> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV026 e").getResultList();
    }

    @Transactional
    public AtmTransactionV026 save(AtmTransactionV026 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV026 entity = em.find(AtmTransactionV026.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
