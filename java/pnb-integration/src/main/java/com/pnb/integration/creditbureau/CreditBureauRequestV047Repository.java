package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV047Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV047> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV047.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV047> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV047 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV047 save(CreditBureauRequestV047 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV047 entity = em.find(CreditBureauRequestV047.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
