package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV020Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV020> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV020.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV020> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV020 e").getResultList();
    }

    @Transactional
    public AtmTransactionV020 save(AtmTransactionV020 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV020 entity = em.find(AtmTransactionV020.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
