package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV014Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV014> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV014.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV014> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV014 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV014 save(CreditBureauRequestV014 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV014 entity = em.find(CreditBureauRequestV014.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
