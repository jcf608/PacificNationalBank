package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV031Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV031> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV031.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV031> findAll() {
        return em.createQuery("SELECT e FROM LoanV031 e").getResultList();
    }

    @Transactional
    public LoanV031 save(LoanV031 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV031 entity = em.find(LoanV031.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
