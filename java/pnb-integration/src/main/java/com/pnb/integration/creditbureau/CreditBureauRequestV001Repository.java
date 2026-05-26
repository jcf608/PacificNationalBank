package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV001Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV001> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV001.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV001> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV001 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV001 save(CreditBureauRequestV001 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV001 entity = em.find(CreditBureauRequestV001.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
