package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV046Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV046> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV046.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV046> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV046 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV046 save(CreditBureauRequestV046 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV046 entity = em.find(CreditBureauRequestV046.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
