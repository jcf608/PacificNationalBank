package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV013Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV013> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV013.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV013> findAll() {
        return em.createQuery("SELECT e FROM DepositV013 e").getResultList();
    }

    @Transactional
    public DepositV013 save(DepositV013 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV013 entity = em.find(DepositV013.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
