package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV004Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV004> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV004.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV004> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV004 e").getResultList();
    }

    @Transactional
    public AtmTransactionV004 save(AtmTransactionV004 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV004 entity = em.find(AtmTransactionV004.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
