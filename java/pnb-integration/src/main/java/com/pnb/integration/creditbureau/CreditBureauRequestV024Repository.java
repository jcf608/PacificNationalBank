package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV024Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV024> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV024.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV024> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV024 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV024 save(CreditBureauRequestV024 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV024 entity = em.find(CreditBureauRequestV024.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
