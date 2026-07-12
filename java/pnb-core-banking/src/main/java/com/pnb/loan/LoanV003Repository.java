package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV003Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV003> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV003.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV003> findAll() {
        return em.createQuery("SELECT e FROM LoanV003 e").getResultList();
    }

    @Transactional
    public LoanV003 save(LoanV003 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV003 entity = em.find(LoanV003.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
