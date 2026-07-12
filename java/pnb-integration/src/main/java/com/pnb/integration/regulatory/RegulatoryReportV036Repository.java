package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV036Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV036> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV036.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV036> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV036 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV036 save(RegulatoryReportV036 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV036 entity = em.find(RegulatoryReportV036.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
