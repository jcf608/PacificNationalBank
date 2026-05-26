package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV001Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV001> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV001.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV001> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV001 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV001 save(RegulatoryReportV001 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV001 entity = em.find(RegulatoryReportV001.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
