package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV009Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV009> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV009.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV009> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV009 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV009 save(CreditBureauRequestV009 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV009 entity = em.find(CreditBureauRequestV009.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
