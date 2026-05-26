package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV012Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV012> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV012.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV012> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV012 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV012 save(CreditBureauRequestV012 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV012 entity = em.find(CreditBureauRequestV012.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
