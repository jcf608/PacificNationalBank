package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV016Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV016> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV016.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV016> findAll() {
        return em.createQuery("SELECT e FROM DepositV016 e").getResultList();
    }

    @Transactional
    public DepositV016 save(DepositV016 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV016 entity = em.find(DepositV016.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
