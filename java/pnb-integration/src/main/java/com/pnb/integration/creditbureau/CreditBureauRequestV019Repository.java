package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV019Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV019> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV019.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV019> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV019 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV019 save(CreditBureauRequestV019 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV019 entity = em.find(CreditBureauRequestV019.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
