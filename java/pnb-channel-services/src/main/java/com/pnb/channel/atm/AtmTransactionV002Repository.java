package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV002Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV002> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV002.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV002> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV002 e").getResultList();
    }

    @Transactional
    public AtmTransactionV002 save(AtmTransactionV002 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV002 entity = em.find(AtmTransactionV002.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
