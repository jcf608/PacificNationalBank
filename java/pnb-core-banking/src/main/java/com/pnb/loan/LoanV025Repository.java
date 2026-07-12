package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV025Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV025> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV025.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV025> findAll() {
        return em.createQuery("SELECT e FROM LoanV025 e").getResultList();
    }

    @Transactional
    public LoanV025 save(LoanV025 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV025 entity = em.find(LoanV025.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
