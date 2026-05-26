package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV020Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV020> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV020.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV020> findAll() {
        return em.createQuery("SELECT e FROM LoanV020 e").getResultList();
    }

    @Transactional
    public LoanV020 save(LoanV020 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV020 entity = em.find(LoanV020.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
