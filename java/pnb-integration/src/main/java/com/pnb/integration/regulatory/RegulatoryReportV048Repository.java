package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV048Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV048> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV048.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV048> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV048 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV048 save(RegulatoryReportV048 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV048 entity = em.find(RegulatoryReportV048.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
