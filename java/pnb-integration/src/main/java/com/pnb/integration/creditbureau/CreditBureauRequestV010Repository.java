package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV010Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV010> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV010.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV010> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV010 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV010 save(CreditBureauRequestV010 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV010 entity = em.find(CreditBureauRequestV010.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
