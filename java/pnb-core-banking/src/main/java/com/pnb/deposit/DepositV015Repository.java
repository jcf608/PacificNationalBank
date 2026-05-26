package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV015Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV015> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV015.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV015> findAll() {
        return em.createQuery("SELECT e FROM DepositV015 e").getResultList();
    }

    @Transactional
    public DepositV015 save(DepositV015 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV015 entity = em.find(DepositV015.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
