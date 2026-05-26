package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV031Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV031> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV031.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV031> findAll() {
        return em.createQuery("SELECT e FROM DepositV031 e").getResultList();
    }

    @Transactional
    public DepositV031 save(DepositV031 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV031 entity = em.find(DepositV031.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
