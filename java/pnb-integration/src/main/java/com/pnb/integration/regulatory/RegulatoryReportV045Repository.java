package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV045Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV045> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV045.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV045> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV045 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV045 save(RegulatoryReportV045 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV045 entity = em.find(RegulatoryReportV045.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
