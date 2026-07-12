package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV005Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV005> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV005.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV005> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV005 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV005 save(RegulatoryReportV005 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV005 entity = em.find(RegulatoryReportV005.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
