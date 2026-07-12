package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV021Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV021> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV021.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV021> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV021 e").getResultList();
    }

    @Transactional
    public AtmTransactionV021 save(AtmTransactionV021 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV021 entity = em.find(AtmTransactionV021.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
