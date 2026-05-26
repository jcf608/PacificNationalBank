package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV036Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV036> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV036.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV036> findAll() {
        return em.createQuery("SELECT e FROM LoanV036 e").getResultList();
    }

    @Transactional
    public LoanV036 save(LoanV036 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV036 entity = em.find(LoanV036.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
