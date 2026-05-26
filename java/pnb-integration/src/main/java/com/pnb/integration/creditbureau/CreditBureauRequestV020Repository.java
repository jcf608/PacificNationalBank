package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV020Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV020> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV020.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV020> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV020 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV020 save(CreditBureauRequestV020 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV020 entity = em.find(CreditBureauRequestV020.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
