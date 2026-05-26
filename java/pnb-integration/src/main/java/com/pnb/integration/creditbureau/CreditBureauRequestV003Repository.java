package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV003Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV003> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV003.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV003> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV003 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV003 save(CreditBureauRequestV003 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV003 entity = em.find(CreditBureauRequestV003.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
