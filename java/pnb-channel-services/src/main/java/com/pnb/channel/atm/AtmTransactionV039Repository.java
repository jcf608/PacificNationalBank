package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV039Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV039> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV039.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV039> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV039 e").getResultList();
    }

    @Transactional
    public AtmTransactionV039 save(AtmTransactionV039 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV039 entity = em.find(AtmTransactionV039.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
