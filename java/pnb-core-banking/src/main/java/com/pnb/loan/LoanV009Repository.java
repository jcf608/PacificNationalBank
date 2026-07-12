package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV009Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV009> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV009.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV009> findAll() {
        return em.createQuery("SELECT e FROM LoanV009 e").getResultList();
    }

    @Transactional
    public LoanV009 save(LoanV009 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV009 entity = em.find(LoanV009.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
