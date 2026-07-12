package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV019Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV019> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV019.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV019> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV019 e").getResultList();
    }

    @Transactional
    public AtmTransactionV019 save(AtmTransactionV019 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV019 entity = em.find(AtmTransactionV019.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
