package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV015Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV015> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV015.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV015> findAll() {
        return em.createQuery("SELECT e FROM LoanV015 e").getResultList();
    }

    @Transactional
    public LoanV015 save(LoanV015 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV015 entity = em.find(LoanV015.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
