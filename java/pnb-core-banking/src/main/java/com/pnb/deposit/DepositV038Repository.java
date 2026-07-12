package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV038Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV038> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV038.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV038> findAll() {
        return em.createQuery("SELECT e FROM DepositV038 e").getResultList();
    }

    @Transactional
    public DepositV038 save(DepositV038 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV038 entity = em.find(DepositV038.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
