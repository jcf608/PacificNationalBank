package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV015Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV015> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV015.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV015> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV015 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV015 save(CreditBureauRequestV015 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV015 entity = em.find(CreditBureauRequestV015.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
