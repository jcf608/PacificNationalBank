package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV029Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV029> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV029.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV029> findAll() {
        return em.createQuery("SELECT e FROM DepositV029 e").getResultList();
    }

    @Transactional
    public DepositV029 save(DepositV029 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV029 entity = em.find(DepositV029.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
