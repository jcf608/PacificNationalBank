package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV006Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV006> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV006.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV006> findAll() {
        return em.createQuery("SELECT e FROM DepositV006 e").getResultList();
    }

    @Transactional
    public DepositV006 save(DepositV006 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV006 entity = em.find(DepositV006.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
