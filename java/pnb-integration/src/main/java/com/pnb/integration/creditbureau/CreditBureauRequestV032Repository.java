package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV032Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV032> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV032.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV032> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV032 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV032 save(CreditBureauRequestV032 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV032 entity = em.find(CreditBureauRequestV032.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
