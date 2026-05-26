package com.pnb.deposit;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class DepositV011Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<DepositV011> findById(Long id) {
        return Optional.ofNullable(em.find(DepositV011.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<DepositV011> findAll() {
        return em.createQuery("SELECT e FROM DepositV011 e").getResultList();
    }

    @Transactional
    public DepositV011 save(DepositV011 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        DepositV011 entity = em.find(DepositV011.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
