package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV033Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV033> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV033.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV033> findAll() {
        return em.createQuery("SELECT e FROM LoanV033 e").getResultList();
    }

    @Transactional
    public LoanV033 save(LoanV033 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV033 entity = em.find(LoanV033.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
