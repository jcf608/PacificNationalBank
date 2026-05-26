package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV028Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV028> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV028.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV028> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV028 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV028 save(CreditBureauRequestV028 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV028 entity = em.find(CreditBureauRequestV028.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
