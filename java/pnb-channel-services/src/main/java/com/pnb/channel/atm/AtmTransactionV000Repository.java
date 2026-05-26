package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV000Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV000> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV000.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV000> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV000 e").getResultList();
    }

    @Transactional
    public AtmTransactionV000 save(AtmTransactionV000 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV000 entity = em.find(AtmTransactionV000.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
