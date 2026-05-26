package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV032Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV032> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV032.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV032> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV032 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV032 save(RegulatoryReportV032 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV032 entity = em.find(RegulatoryReportV032.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
