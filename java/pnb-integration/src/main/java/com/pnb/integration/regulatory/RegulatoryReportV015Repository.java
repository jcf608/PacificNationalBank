package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV015Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV015> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV015.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV015> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV015 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV015 save(RegulatoryReportV015 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV015 entity = em.find(RegulatoryReportV015.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
