package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV016Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV016> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV016.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV016> findAll() {
        return em.createQuery("SELECT e FROM LoanV016 e").getResultList();
    }

    @Transactional
    public LoanV016 save(LoanV016 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV016 entity = em.find(LoanV016.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
