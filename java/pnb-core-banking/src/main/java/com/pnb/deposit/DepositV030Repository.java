package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV030Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV030> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV030.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV030> findAll() {
        return em.createQuery("SELECT e FROM DepositV030 e").getResultList();
    }

    @Transactional
    public DepositV030 save(DepositV030 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV030 entity = em.find(DepositV030.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
