package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV001Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV001> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV001.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV001> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV001 e").getResultList();
    }

    @Transactional
    public AtmTransactionV001 save(AtmTransactionV001 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV001 entity = em.find(AtmTransactionV001.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
