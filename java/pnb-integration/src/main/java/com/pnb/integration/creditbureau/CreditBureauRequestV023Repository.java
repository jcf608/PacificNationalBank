package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV023Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV023> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV023.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV023> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV023 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV023 save(CreditBureauRequestV023 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV023 entity = em.find(CreditBureauRequestV023.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
