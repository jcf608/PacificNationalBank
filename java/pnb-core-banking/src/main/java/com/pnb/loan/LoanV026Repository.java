package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV026Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV026> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV026.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV026> findAll() {
        return em.createQuery("SELECT e FROM LoanV026 e").getResultList();
    }

    @Transactional
    public LoanV026 save(LoanV026 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV026 entity = em.find(LoanV026.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
