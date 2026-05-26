package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV018Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV018> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV018.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV018> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV018 e").getResultList();
    }

    @Transactional
    public AtmTransactionV018 save(AtmTransactionV018 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV018 entity = em.find(AtmTransactionV018.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
