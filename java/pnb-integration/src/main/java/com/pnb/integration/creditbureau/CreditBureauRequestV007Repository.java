package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV007Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV007> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV007.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV007> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV007 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV007 save(CreditBureauRequestV007 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV007 entity = em.find(CreditBureauRequestV007.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
