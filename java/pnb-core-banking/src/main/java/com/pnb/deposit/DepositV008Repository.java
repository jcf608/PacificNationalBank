package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV008Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV008> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV008.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV008> findAll() {
        return em.createQuery("SELECT e FROM DepositV008 e").getResultList();
    }

    @Transactional
    public DepositV008 save(DepositV008 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV008 entity = em.find(DepositV008.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
