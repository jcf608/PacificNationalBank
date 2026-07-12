package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV023Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV023> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV023.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV023> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV023 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV023 save(RegulatoryReportV023 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV023 entity = em.find(RegulatoryReportV023.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
