package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV027Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV027> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV027.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV027> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV027 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV027 save(RegulatoryReportV027 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV027 entity = em.find(RegulatoryReportV027.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
