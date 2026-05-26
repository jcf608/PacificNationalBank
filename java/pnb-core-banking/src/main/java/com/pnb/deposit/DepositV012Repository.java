package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV012Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV012> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV012.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV012> findAll() {
        return em.createQuery("SELECT e FROM DepositV012 e").getResultList();
    }

    @Transactional
    public DepositV012 save(DepositV012 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV012 entity = em.find(DepositV012.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
