package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV016Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV016> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV016.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV016> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV016 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV016 save(RegulatoryReportV016 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV016 entity = em.find(RegulatoryReportV016.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
