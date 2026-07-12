package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV034Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV034> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV034.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV034> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV034 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV034 save(CreditBureauRequestV034 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV034 entity = em.find(CreditBureauRequestV034.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
