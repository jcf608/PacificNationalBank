package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV019Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV019> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV019.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV019> findAll() {
        return em.createQuery("SELECT e FROM LoanV019 e").getResultList();
    }

    @Transactional
    public LoanV019 save(LoanV019 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV019 entity = em.find(LoanV019.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
