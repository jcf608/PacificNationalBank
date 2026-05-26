package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV002Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV002> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV002.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV002> findAll() {
        return em.createQuery("SELECT e FROM LoanV002 e").getResultList();
    }

    @Transactional
    public LoanV002 save(LoanV002 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV002 entity = em.find(LoanV002.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
