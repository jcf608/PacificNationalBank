package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV005Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV005> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV005.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV005> findAll() {
        return em.createQuery("SELECT e FROM DepositV005 e").getResultList();
    }

    @Transactional
    public DepositV005 save(DepositV005 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV005 entity = em.find(DepositV005.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
