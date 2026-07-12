package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV016Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV016> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV016.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV016> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV016 e").getResultList();
    }

    @Transactional
    public AtmTransactionV016 save(AtmTransactionV016 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV016 entity = em.find(AtmTransactionV016.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
