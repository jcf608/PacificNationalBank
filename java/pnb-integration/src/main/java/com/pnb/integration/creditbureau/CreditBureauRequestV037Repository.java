package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV037Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV037> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV037.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV037> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV037 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV037 save(CreditBureauRequestV037 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV037 entity = em.find(CreditBureauRequestV037.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
