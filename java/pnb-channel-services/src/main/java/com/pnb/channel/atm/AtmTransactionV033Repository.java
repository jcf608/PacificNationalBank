package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV033Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV033> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV033.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV033> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV033 e").getResultList();
    }

    @Transactional
    public AtmTransactionV033 save(AtmTransactionV033 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV033 entity = em.find(AtmTransactionV033.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
