package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV036Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV036> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV036.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV036> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV036 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV036 save(CreditBureauRequestV036 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV036 entity = em.find(CreditBureauRequestV036.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
