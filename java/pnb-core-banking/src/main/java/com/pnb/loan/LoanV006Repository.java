package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV006Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV006> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV006.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV006> findAll() {
        return em.createQuery("SELECT e FROM LoanV006 e").getResultList();
    }

    @Transactional
    public LoanV006 save(LoanV006 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV006 entity = em.find(LoanV006.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
