package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV035Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV035> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV035.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV035> findAll() {
        return em.createQuery("SELECT e FROM LoanV035 e").getResultList();
    }

    @Transactional
    public LoanV035 save(LoanV035 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV035 entity = em.find(LoanV035.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
