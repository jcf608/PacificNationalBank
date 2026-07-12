package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV039Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV039> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV039.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV039> findAll() {
        return em.createQuery("SELECT e FROM DepositV039 e").getResultList();
    }

    @Transactional
    public DepositV039 save(DepositV039 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV039 entity = em.find(DepositV039.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
