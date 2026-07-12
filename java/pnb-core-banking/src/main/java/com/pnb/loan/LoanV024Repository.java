package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV024Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV024> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV024.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV024> findAll() {
        return em.createQuery("SELECT e FROM LoanV024 e").getResultList();
    }

    @Transactional
    public LoanV024 save(LoanV024 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV024 entity = em.find(LoanV024.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
