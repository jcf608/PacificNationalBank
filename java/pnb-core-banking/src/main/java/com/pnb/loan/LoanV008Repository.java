package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV008Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV008> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV008.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV008> findAll() {
        return em.createQuery("SELECT e FROM LoanV008 e").getResultList();
    }

    @Transactional
    public LoanV008 save(LoanV008 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV008 entity = em.find(LoanV008.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
