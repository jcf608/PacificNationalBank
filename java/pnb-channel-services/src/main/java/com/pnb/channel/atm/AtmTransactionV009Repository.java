package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV009Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV009> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV009.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV009> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV009 e").getResultList();
    }

    @Transactional
    public AtmTransactionV009 save(AtmTransactionV009 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV009 entity = em.find(AtmTransactionV009.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
