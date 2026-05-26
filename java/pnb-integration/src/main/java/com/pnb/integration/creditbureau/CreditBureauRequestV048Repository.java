package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV048Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV048> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV048.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV048> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV048 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV048 save(CreditBureauRequestV048 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV048 entity = em.find(CreditBureauRequestV048.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
