package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV033Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV033> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV033.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV033> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV033 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV033 save(RegulatoryReportV033 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV033 entity = em.find(RegulatoryReportV033.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
