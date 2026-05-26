package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV032Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV032> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV032.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV032> findAll() {
        return em.createQuery("SELECT e FROM LoanV032 e").getResultList();
    }

    @Transactional
    public LoanV032 save(LoanV032 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV032 entity = em.find(LoanV032.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
