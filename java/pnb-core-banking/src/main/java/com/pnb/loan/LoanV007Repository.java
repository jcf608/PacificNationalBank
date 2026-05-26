package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV007Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV007> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV007.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV007> findAll() {
        return em.createQuery("SELECT e FROM LoanV007 e").getResultList();
    }

    @Transactional
    public LoanV007 save(LoanV007 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV007 entity = em.find(LoanV007.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
