package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV025Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV025> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV025.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV025> findAll() {
        return em.createQuery("SELECT e FROM DepositV025 e").getResultList();
    }

    @Transactional
    public DepositV025 save(DepositV025 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV025 entity = em.find(DepositV025.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
