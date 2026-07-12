package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV037Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV037> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV037.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV037> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV037 e").getResultList();
    }

    @Transactional
    public AtmTransactionV037 save(AtmTransactionV037 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV037 entity = em.find(AtmTransactionV037.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
