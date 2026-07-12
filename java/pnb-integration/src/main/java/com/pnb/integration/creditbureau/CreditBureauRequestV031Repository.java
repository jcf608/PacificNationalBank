package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV031Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV031> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV031.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV031> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV031 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV031 save(CreditBureauRequestV031 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV031 entity = em.find(CreditBureauRequestV031.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
