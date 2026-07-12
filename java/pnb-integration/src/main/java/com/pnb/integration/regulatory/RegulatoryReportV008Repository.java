package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV008Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV008> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV008.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV008> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV008 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV008 save(RegulatoryReportV008 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV008 entity = em.find(RegulatoryReportV008.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
