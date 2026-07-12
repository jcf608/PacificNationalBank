package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV035Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV035> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV035.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV035> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV035 e").getResultList();
    }

    @Transactional
    public AtmTransactionV035 save(AtmTransactionV035 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV035 entity = em.find(AtmTransactionV035.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
