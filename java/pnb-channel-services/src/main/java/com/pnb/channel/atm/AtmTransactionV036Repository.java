package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV036Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV036> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV036.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV036> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV036 e").getResultList();
    }

    @Transactional
    public AtmTransactionV036 save(AtmTransactionV036 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV036 entity = em.find(AtmTransactionV036.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
