package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV030Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV030> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV030.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV030> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV030 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV030 save(CreditBureauRequestV030 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV030 entity = em.find(CreditBureauRequestV030.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
