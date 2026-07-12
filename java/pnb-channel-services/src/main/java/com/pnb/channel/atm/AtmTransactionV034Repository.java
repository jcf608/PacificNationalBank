package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV034Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV034> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV034.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV034> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV034 e").getResultList();
    }

    @Transactional
    public AtmTransactionV034 save(AtmTransactionV034 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV034 entity = em.find(AtmTransactionV034.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
