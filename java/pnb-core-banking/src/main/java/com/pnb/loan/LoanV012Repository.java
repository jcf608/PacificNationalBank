package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV012Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV012> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV012.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV012> findAll() {
        return em.createQuery("SELECT e FROM LoanV012 e").getResultList();
    }

    @Transactional
    public LoanV012 save(LoanV012 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV012 entity = em.find(LoanV012.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
