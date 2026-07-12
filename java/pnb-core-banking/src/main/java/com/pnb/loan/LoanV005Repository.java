package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV005Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV005> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV005.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV005> findAll() {
        return em.createQuery("SELECT e FROM LoanV005 e").getResultList();
    }

    @Transactional
    public LoanV005 save(LoanV005 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV005 entity = em.find(LoanV005.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
