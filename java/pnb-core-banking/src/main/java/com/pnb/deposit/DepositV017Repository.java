package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV017Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV017> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV017.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV017> findAll() {
        return em.createQuery("SELECT e FROM DepositV017 e").getResultList();
    }

    @Transactional
    public DepositV017 save(DepositV017 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV017 entity = em.find(DepositV017.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
