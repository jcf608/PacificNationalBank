package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV018Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV018> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV018.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV018> findAll() {
        return em.createQuery("SELECT e FROM LoanV018 e").getResultList();
    }

    @Transactional
    public LoanV018 save(LoanV018 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV018 entity = em.find(LoanV018.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
