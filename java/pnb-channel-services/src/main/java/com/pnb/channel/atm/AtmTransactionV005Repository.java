package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV005Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV005> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV005.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV005> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV005 e").getResultList();
    }

    @Transactional
    public AtmTransactionV005 save(AtmTransactionV005 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV005 entity = em.find(AtmTransactionV005.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
