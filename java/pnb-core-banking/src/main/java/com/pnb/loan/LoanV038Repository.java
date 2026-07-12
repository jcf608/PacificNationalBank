package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV038Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV038> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV038.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV038> findAll() {
        return em.createQuery("SELECT e FROM LoanV038 e").getResultList();
    }

    @Transactional
    public LoanV038 save(LoanV038 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV038 entity = em.find(LoanV038.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
