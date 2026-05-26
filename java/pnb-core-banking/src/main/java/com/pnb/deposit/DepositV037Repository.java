package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV037Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV037> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV037.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV037> findAll() {
        return em.createQuery("SELECT e FROM DepositV037 e").getResultList();
    }

    @Transactional
    public DepositV037 save(DepositV037 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV037 entity = em.find(DepositV037.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
