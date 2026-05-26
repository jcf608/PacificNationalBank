package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV044Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV044> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV044.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV044> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV044 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV044 save(RegulatoryReportV044 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV044 entity = em.find(RegulatoryReportV044.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
