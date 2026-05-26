package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV007Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV007> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV007.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV007> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV007 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV007 save(RegulatoryReportV007 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV007 entity = em.find(RegulatoryReportV007.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
