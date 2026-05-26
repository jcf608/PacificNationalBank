package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV000Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV000> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV000.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV000> findAll() {
        return em.createQuery("SELECT e FROM LoanV000 e").getResultList();
    }

    @Transactional
    public LoanV000 save(LoanV000 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV000 entity = em.find(LoanV000.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
