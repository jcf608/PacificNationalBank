package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV000Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV000> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV000.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV000> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV000 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV000 save(RegulatoryReportV000 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV000 entity = em.find(RegulatoryReportV000.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
