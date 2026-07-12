package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV000Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV000> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV000.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV000> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV000 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV000 save(CreditBureauRequestV000 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV000 entity = em.find(CreditBureauRequestV000.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
