package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV029Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV029> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV029.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV029> findAll() {
        return em.createQuery("SELECT e FROM LoanV029 e").getResultList();
    }

    @Transactional
    public LoanV029 save(LoanV029 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV029 entity = em.find(LoanV029.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
