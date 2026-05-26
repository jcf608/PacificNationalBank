package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV003Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV003> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV003.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV003> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV003 e").getResultList();
    }

    @Transactional
    public AtmTransactionV003 save(AtmTransactionV003 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV003 entity = em.find(AtmTransactionV003.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
