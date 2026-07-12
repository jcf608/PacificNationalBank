package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV023Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV023> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV023.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV023> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV023 e").getResultList();
    }

    @Transactional
    public AtmTransactionV023 save(AtmTransactionV023 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV023 entity = em.find(AtmTransactionV023.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
