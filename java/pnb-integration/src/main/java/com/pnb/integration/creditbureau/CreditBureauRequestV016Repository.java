package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV016Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV016> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV016.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV016> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV016 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV016 save(CreditBureauRequestV016 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV016 entity = em.find(CreditBureauRequestV016.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
