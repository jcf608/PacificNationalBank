package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV013Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV013> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV013.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV013> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV013 e").getResultList();
    }

    @Transactional
    public AtmTransactionV013 save(AtmTransactionV013 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV013 entity = em.find(AtmTransactionV013.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
