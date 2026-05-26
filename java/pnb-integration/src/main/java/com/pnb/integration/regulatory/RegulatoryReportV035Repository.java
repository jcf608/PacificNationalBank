package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV035Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV035> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV035.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV035> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV035 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV035 save(RegulatoryReportV035 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV035 entity = em.find(RegulatoryReportV035.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
