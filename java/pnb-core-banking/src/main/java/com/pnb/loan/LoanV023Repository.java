package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV023Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV023> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV023.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV023> findAll() {
        return em.createQuery("SELECT e FROM LoanV023 e").getResultList();
    }

    @Transactional
    public LoanV023 save(LoanV023 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV023 entity = em.find(LoanV023.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
