package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV003Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV003> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV003.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV003> findAll() {
        return em.createQuery("SELECT e FROM DepositV003 e").getResultList();
    }

    @Transactional
    public DepositV003 save(DepositV003 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV003 entity = em.find(DepositV003.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
