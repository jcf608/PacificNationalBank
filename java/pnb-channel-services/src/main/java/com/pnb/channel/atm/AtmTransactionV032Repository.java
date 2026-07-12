package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV032Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV032> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV032.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV032> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV032 e").getResultList();
    }

    @Transactional
    public AtmTransactionV032 save(AtmTransactionV032 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV032 entity = em.find(AtmTransactionV032.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
