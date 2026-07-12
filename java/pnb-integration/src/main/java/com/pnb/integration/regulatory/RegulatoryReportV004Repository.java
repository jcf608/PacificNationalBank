package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV004Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV004> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV004.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV004> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV004 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV004 save(RegulatoryReportV004 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV004 entity = em.find(RegulatoryReportV004.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
