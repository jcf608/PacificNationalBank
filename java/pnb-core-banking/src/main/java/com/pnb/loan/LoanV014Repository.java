package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV014Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV014> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV014.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV014> findAll() {
        return em.createQuery("SELECT e FROM LoanV014 e").getResultList();
    }

    @Transactional
    public LoanV014 save(LoanV014 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV014 entity = em.find(LoanV014.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
