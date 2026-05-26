package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV021Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV021> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV021.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV021> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV021 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV021 save(CreditBureauRequestV021 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV021 entity = em.find(CreditBureauRequestV021.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
