package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV007Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV007> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV007.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV007> findAll() {
        return em.createQuery("SELECT e FROM DepositV007 e").getResultList();
    }

    @Transactional
    public DepositV007 save(DepositV007 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV007 entity = em.find(DepositV007.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
