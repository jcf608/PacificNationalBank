package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV025Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV025> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV025.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV025> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV025 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV025 save(RegulatoryReportV025 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV025 entity = em.find(RegulatoryReportV025.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
