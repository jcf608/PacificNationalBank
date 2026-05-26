package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV023Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV023> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV023.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV023> findAll() {
        return em.createQuery("SELECT e FROM DepositV023 e").getResultList();
    }

    @Transactional
    public DepositV023 save(DepositV023 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV023 entity = em.find(DepositV023.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
