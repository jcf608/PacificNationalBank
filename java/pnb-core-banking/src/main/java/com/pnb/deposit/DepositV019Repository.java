package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV019Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV019> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV019.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV019> findAll() {
        return em.createQuery("SELECT e FROM DepositV019 e").getResultList();
    }

    @Transactional
    public DepositV019 save(DepositV019 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV019 entity = em.find(DepositV019.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
