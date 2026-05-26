package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV034Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV034> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV034.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV034> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV034 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV034 save(RegulatoryReportV034 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV034 entity = em.find(RegulatoryReportV034.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
