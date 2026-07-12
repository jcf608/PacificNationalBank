package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV017Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV017> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV017.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV017> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV017 e").getResultList();
    }

    @Transactional
    public AtmTransactionV017 save(AtmTransactionV017 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV017 entity = em.find(AtmTransactionV017.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
