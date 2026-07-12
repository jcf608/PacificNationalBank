package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV034Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV034> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV034.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV034> findAll() {
        return em.createQuery("SELECT e FROM LoanV034 e").getResultList();
    }

    @Transactional
    public LoanV034 save(LoanV034 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV034 entity = em.find(LoanV034.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
