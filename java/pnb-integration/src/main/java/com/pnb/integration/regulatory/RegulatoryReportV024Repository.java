package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV024Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV024> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV024.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV024> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV024 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV024 save(RegulatoryReportV024 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV024 entity = em.find(RegulatoryReportV024.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
