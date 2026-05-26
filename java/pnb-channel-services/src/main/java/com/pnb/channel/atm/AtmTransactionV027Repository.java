package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV027Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV027> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV027.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV027> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV027 e").getResultList();
    }

    @Transactional
    public AtmTransactionV027 save(AtmTransactionV027 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV027 entity = em.find(AtmTransactionV027.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
