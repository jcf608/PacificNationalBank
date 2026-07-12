package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV030Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV030> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV030.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV030> findAll() {
        return em.createQuery("SELECT e FROM LoanV030 e").getResultList();
    }

    @Transactional
    public LoanV030 save(LoanV030 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV030 entity = em.find(LoanV030.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
