package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV001Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV001> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV001.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV001> findAll() {
        return em.createQuery("SELECT e FROM DepositV001 e").getResultList();
    }

    @Transactional
    public DepositV001 save(DepositV001 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV001 entity = em.find(DepositV001.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
