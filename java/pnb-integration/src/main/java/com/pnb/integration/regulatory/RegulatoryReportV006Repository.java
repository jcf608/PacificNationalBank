package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV006Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV006> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV006.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV006> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV006 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV006 save(RegulatoryReportV006 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV006 entity = em.find(RegulatoryReportV006.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
