package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV022Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV022> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV022.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV022> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV022 e").getResultList();
    }

    @Transactional
    public AtmTransactionV022 save(AtmTransactionV022 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV022 entity = em.find(AtmTransactionV022.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
