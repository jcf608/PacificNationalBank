package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV005Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV005> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV005.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV005> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV005 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV005 save(CreditBureauRequestV005 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV005 entity = em.find(CreditBureauRequestV005.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
