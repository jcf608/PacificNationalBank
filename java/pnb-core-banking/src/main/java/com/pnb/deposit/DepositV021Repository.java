package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV021Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV021> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV021.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV021> findAll() {
        return em.createQuery("SELECT e FROM DepositV021 e").getResultList();
    }

    @Transactional
    public DepositV021 save(DepositV021 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV021 entity = em.find(DepositV021.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
