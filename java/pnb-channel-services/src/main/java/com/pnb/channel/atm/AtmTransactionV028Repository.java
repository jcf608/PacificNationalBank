package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV028Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV028> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV028.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV028> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV028 e").getResultList();
    }

    @Transactional
    public AtmTransactionV028 save(AtmTransactionV028 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV028 entity = em.find(AtmTransactionV028.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
