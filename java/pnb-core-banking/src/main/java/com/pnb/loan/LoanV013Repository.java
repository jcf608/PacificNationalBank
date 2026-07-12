package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV013Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV013> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV013.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV013> findAll() {
        return em.createQuery("SELECT e FROM LoanV013 e").getResultList();
    }

    @Transactional
    public LoanV013 save(LoanV013 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV013 entity = em.find(LoanV013.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
