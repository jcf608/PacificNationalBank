package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV046Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV046> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV046.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV046> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV046 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV046 save(RegulatoryReportV046 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV046 entity = em.find(RegulatoryReportV046.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
