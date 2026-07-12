package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV032Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV032> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV032.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV032> findAll() {
        return em.createQuery("SELECT e FROM DepositV032 e").getResultList();
    }

    @Transactional
    public DepositV032 save(DepositV032 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV032 entity = em.find(DepositV032.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
