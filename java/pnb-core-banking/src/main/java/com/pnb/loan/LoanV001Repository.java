package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV001Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV001> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV001.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV001> findAll() {
        return em.createQuery("SELECT e FROM LoanV001 e").getResultList();
    }

    @Transactional
    public LoanV001 save(LoanV001 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV001 entity = em.find(LoanV001.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
