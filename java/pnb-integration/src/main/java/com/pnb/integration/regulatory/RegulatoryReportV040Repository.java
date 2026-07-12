package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV040Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV040> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV040.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV040> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV040 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV040 save(RegulatoryReportV040 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV040 entity = em.find(RegulatoryReportV040.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
