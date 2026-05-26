package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV041Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV041> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV041.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV041> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV041 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV041 save(CreditBureauRequestV041 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV041 entity = em.find(CreditBureauRequestV041.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
