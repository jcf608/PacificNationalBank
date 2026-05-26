package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV039Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV039> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV039.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV039> findAll() {
        return em.createQuery("SELECT e FROM LoanV039 e").getResultList();
    }

    @Transactional
    public LoanV039 save(LoanV039 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV039 entity = em.find(LoanV039.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
