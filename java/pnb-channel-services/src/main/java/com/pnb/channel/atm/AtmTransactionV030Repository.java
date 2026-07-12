package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV030Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV030> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV030.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV030> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV030 e").getResultList();
    }

    @Transactional
    public AtmTransactionV030 save(AtmTransactionV030 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV030 entity = em.find(AtmTransactionV030.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
