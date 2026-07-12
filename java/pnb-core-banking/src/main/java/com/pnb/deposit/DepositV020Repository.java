package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV020Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV020> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV020.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV020> findAll() {
        return em.createQuery("SELECT e FROM DepositV020 e").getResultList();
    }

    @Transactional
    public DepositV020 save(DepositV020 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV020 entity = em.find(DepositV020.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
