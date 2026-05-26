package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV017Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV017> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV017.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV017> findAll() {
        return em.createQuery("SELECT e FROM LoanV017 e").getResultList();
    }

    @Transactional
    public LoanV017 save(LoanV017 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV017 entity = em.find(LoanV017.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
