package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV014Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV014> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV014.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV014> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV014 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV014 save(RegulatoryReportV014 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV014 entity = em.find(RegulatoryReportV014.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
