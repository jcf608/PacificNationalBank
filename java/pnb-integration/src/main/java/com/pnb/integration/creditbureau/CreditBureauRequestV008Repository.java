package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV008Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV008> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV008.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV008> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV008 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV008 save(CreditBureauRequestV008 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV008 entity = em.find(CreditBureauRequestV008.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
