package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV002Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV002> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV002.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV002> findAll() {
        return em.createQuery("SELECT e FROM DepositV002 e").getResultList();
    }

    @Transactional
    public DepositV002 save(DepositV002 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV002 entity = em.find(DepositV002.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
