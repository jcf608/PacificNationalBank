package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV039Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV039> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV039.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV039> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV039 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV039 save(CreditBureauRequestV039 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV039 entity = em.find(CreditBureauRequestV039.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
