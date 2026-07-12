package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV033Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV033> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV033.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV033> findAll() {
        return em.createQuery("SELECT e FROM DepositV033 e").getResultList();
    }

    @Transactional
    public DepositV033 save(DepositV033 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV033 entity = em.find(DepositV033.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
