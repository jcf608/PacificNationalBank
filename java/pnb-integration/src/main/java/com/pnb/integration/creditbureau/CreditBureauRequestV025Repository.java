package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV025Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV025> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV025.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV025> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV025 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV025 save(CreditBureauRequestV025 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV025 entity = em.find(CreditBureauRequestV025.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
