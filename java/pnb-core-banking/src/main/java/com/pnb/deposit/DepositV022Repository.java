package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV022Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV022> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV022.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV022> findAll() {
        return em.createQuery("SELECT e FROM DepositV022 e").getResultList();
    }

    @Transactional
    public DepositV022 save(DepositV022 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV022 entity = em.find(DepositV022.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
