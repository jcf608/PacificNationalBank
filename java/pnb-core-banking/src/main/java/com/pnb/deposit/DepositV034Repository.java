package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV034Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV034> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV034.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV034> findAll() {
        return em.createQuery("SELECT e FROM DepositV034 e").getResultList();
    }

    @Transactional
    public DepositV034 save(DepositV034 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV034 entity = em.find(DepositV034.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
