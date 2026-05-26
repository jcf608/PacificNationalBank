package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV018Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV018> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV018.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV018> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV018 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV018 save(CreditBureauRequestV018 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV018 entity = em.find(CreditBureauRequestV018.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
