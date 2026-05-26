package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV017Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV017> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV017.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV017> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV017 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV017 save(CreditBureauRequestV017 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV017 entity = em.find(CreditBureauRequestV017.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
