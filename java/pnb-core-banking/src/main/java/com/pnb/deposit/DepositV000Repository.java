package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV000Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV000> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV000.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV000> findAll() {
        return em.createQuery("SELECT e FROM DepositV000 e").getResultList();
    }

    @Transactional
    public DepositV000 save(DepositV000 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV000 entity = em.find(DepositV000.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
