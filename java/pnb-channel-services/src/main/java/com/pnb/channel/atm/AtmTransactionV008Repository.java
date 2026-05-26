package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV008Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV008> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV008.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV008> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV008 e").getResultList();
    }

    @Transactional
    public AtmTransactionV008 save(AtmTransactionV008 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV008 entity = em.find(AtmTransactionV008.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
