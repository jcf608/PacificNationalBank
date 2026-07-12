package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV039Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV039> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV039.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV039> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV039 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV039 save(RegulatoryReportV039 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV039 entity = em.find(RegulatoryReportV039.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
