package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV027Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV027> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV027.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV027> findAll() {
        return em.createQuery("SELECT e FROM LoanV027 e").getResultList();
    }

    @Transactional
    public LoanV027 save(LoanV027 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV027 entity = em.find(LoanV027.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
