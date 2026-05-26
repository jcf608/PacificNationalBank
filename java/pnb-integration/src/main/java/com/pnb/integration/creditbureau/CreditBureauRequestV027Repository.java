package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV027Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV027> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV027.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV027> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV027 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV027 save(CreditBureauRequestV027 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV027 entity = em.find(CreditBureauRequestV027.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
