package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV044Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV044> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV044.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV044> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV044 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV044 save(CreditBureauRequestV044 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV044 entity = em.find(CreditBureauRequestV044.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
