package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV038Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV038> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV038.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV038> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV038 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV038 save(CreditBureauRequestV038 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV038 entity = em.find(CreditBureauRequestV038.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
