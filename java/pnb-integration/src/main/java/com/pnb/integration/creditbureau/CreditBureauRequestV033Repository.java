package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV033Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV033> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV033.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV033> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV033 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV033 save(CreditBureauRequestV033 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV033 entity = em.find(CreditBureauRequestV033.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
