package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV047Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV047> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV047.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV047> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV047 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV047 save(RegulatoryReportV047 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV047 entity = em.find(RegulatoryReportV047.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
