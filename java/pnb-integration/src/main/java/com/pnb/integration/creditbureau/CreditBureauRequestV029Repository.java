package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV029Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV029> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV029.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV029> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV029 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV029 save(CreditBureauRequestV029 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV029 entity = em.find(CreditBureauRequestV029.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
