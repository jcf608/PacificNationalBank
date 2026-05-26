package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV018Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV018> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV018.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV018> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV018 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV018 save(RegulatoryReportV018 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV018 entity = em.find(RegulatoryReportV018.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
