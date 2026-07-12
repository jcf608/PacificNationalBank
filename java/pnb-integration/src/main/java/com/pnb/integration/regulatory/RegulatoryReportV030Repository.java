package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV030Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV030> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV030.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV030> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV030 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV030 save(RegulatoryReportV030 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV030 entity = em.find(RegulatoryReportV030.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
