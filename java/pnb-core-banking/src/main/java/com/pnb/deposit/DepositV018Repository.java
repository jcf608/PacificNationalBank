package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV018Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV018> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV018.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV018> findAll() {
        return em.createQuery("SELECT e FROM DepositV018 e").getResultList();
    }

    @Transactional
    public DepositV018 save(DepositV018 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV018 entity = em.find(DepositV018.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
