package com.pnb.integration.creditbureau;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class CreditBureauRequestV022Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<CreditBureauRequestV022> findById(Long id) {
        return Optional.ofNullable(em.find(CreditBureauRequestV022.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<CreditBureauRequestV022> findAll() {
        return em.createQuery("SELECT e FROM CreditBureauRequestV022 e").getResultList();
    }

    @Transactional
    public CreditBureauRequestV022 save(CreditBureauRequestV022 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        CreditBureauRequestV022 entity = em.find(CreditBureauRequestV022.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
