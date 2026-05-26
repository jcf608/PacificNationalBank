package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV010Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV010> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV010.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV010> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV010 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV010 save(RegulatoryReportV010 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV010 entity = em.find(RegulatoryReportV010.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
