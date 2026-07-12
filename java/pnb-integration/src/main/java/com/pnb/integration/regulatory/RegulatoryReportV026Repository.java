package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV026Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV026> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV026.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV026> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV026 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV026 save(RegulatoryReportV026 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV026 entity = em.find(RegulatoryReportV026.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
