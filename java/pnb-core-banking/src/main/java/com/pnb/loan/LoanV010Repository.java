package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV010Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV010> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV010.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV010> findAll() {
        return em.createQuery("SELECT e FROM LoanV010 e").getResultList();
    }

    @Transactional
    public LoanV010 save(LoanV010 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV010 entity = em.find(LoanV010.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
