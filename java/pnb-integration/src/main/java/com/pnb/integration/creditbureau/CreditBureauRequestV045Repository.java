package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV045Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV045> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV045.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV045> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV045 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV045 save(CreditBureauRequestV045 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV045 entity = em.find(CreditBureauRequestV045.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
