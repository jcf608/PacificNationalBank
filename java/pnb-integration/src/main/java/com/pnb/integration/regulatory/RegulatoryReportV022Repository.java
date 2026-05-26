package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV022Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV022> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV022.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV022> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV022 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV022 save(RegulatoryReportV022 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV022 entity = em.find(RegulatoryReportV022.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
