package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV014Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV014> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV014.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV014> findAll() {
        return em.createQuery("SELECT e FROM DepositV014 e").getResultList();
    }

    @Transactional
    public DepositV014 save(DepositV014 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV014 entity = em.find(DepositV014.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
