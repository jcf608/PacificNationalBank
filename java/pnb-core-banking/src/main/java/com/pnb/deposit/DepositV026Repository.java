package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV026Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV026> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV026.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV026> findAll() {
        return em.createQuery("SELECT e FROM DepositV026 e").getResultList();
    }

    @Transactional
    public DepositV026 save(DepositV026 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV026 entity = em.find(DepositV026.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
