package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV049Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV049> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV049.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV049> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV049 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV049 save(CreditBureauRequestV049 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV049 entity = em.find(CreditBureauRequestV049.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
