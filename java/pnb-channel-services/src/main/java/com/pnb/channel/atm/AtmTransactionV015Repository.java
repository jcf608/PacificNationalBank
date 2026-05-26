package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV015Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV015> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV015.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV015> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV015 e").getResultList();
    }

    @Transactional
    public AtmTransactionV015 save(AtmTransactionV015 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV015 entity = em.find(AtmTransactionV015.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
