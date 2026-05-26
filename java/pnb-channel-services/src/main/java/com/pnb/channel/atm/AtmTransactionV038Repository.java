package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV038Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV038> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV038.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV038> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV038 e").getResultList();
    }

    @Transactional
    public AtmTransactionV038 save(AtmTransactionV038 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV038 entity = em.find(AtmTransactionV038.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
