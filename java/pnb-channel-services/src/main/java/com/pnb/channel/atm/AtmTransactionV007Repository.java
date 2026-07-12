package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV007Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV007> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV007.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV007> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV007 e").getResultList();
    }

    @Transactional
    public AtmTransactionV007 save(AtmTransactionV007 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV007 entity = em.find(AtmTransactionV007.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
