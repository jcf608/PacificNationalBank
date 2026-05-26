package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV011Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV011> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV011.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV011> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV011 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV011 save(CreditBureauRequestV011 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV011 entity = em.find(CreditBureauRequestV011.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
