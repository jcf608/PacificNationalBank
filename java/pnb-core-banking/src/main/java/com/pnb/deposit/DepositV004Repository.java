package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV004Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV004> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV004.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV004> findAll() {
        return em.createQuery("SELECT e FROM DepositV004 e").getResultList();
    }

    @Transactional
    public DepositV004 save(DepositV004 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV004 entity = em.find(DepositV004.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
