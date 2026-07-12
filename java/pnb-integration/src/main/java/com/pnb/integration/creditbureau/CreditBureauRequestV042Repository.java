package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV042Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV042> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV042.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV042> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV042 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV042 save(CreditBureauRequestV042 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV042 entity = em.find(CreditBureauRequestV042.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
