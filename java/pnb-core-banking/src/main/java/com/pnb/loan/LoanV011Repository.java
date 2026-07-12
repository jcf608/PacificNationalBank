package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV011Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV011> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV011.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV011> findAll() {
        return em.createQuery("SELECT e FROM LoanV011 e").getResultList();
    }

    @Transactional
    public LoanV011 save(LoanV011 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV011 entity = em.find(LoanV011.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
