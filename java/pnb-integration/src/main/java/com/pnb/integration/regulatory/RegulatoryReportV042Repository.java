package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV042Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV042> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV042.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV042> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV042 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV042 save(RegulatoryReportV042 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV042 entity = em.find(RegulatoryReportV042.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
