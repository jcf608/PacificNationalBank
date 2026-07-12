package com.pnb.channel.atm;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class AtmTransactionV010Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<AtmTransactionV010> findById(Long id) {
        return Optional.ofNullable(em.find(AtmTransactionV010.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<AtmTransactionV010> findAll() {
        return em.createQuery("SELECT e FROM AtmTransactionV010 e").getResultList();
    }

    @Transactional
    public AtmTransactionV010 save(AtmTransactionV010 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        AtmTransactionV010 entity = em.find(AtmTransactionV010.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
