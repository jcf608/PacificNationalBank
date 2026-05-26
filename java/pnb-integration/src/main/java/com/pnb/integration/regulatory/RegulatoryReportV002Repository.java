package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV002Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV002> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV002.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV002> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV002 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV002 save(RegulatoryReportV002 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV002 entity = em.find(RegulatoryReportV002.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
