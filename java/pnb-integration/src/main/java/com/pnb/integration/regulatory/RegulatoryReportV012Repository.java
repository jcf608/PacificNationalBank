package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV012Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV012> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV012.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV012> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV012 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV012 save(RegulatoryReportV012 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV012 entity = em.find(RegulatoryReportV012.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
