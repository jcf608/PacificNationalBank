package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV010Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV010> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV010.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV010> findAll() {
        return em.createQuery("SELECT e FROM DepositV010 e").getResultList();
    }

    @Transactional
    public DepositV010 save(DepositV010 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV010 entity = em.find(DepositV010.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
