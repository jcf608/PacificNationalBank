package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV028Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV028> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV028.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV028> findAll() {
        return em.createQuery("SELECT e FROM DepositV028 e").getResultList();
    }

    @Transactional
    public DepositV028 save(DepositV028 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV028 entity = em.find(DepositV028.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
