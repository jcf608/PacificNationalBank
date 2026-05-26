package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV021Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV021> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV021.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV021> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV021 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV021 save(RegulatoryReportV021 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV021 entity = em.find(RegulatoryReportV021.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
