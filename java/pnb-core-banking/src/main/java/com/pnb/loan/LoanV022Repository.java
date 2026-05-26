package com.pnb.loan;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class LoanV022Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LoanV022> findById(Long id) {
        return Optional.ofNullable(em.find(LoanV022.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<LoanV022> findAll() {
        return em.createQuery("SELECT e FROM LoanV022 e").getResultList();
    }

    @Transactional
    public LoanV022 save(LoanV022 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        LoanV022 entity = em.find(LoanV022.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
