package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV006Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV006> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV006.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV006> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV006 e").getResultList();
    }

    @Transactional
    public AtmTransactionV006 save(AtmTransactionV006 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV006 entity = em.find(AtmTransactionV006.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
