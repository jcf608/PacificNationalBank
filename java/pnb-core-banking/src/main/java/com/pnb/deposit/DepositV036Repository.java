package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV036Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV036> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV036.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV036> findAll() {
        return em.createQuery("SELECT e FROM DepositV036 e").getResultList();
    }

    @Transactional
    public DepositV036 save(DepositV036 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV036 entity = em.find(DepositV036.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
