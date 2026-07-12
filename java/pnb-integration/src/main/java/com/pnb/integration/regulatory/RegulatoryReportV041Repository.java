package com.pnb.integration.regulatory;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.transaction.Transactional;

@ApplicationScoped
public class RegulatoryReportV041Repository {

    @PersistenceContext
    private EntityManager em;

    public Optional<RegulatoryReportV041> findById(Long id) {
        return Optional.ofNullable(em.find(RegulatoryReportV041.class, id));
    }

    @SuppressWarnings("unchecked")
    public List<RegulatoryReportV041> findAll() {
        return em.createQuery("SELECT e FROM RegulatoryReportV041 e").getResultList();
    }

    @Transactional
    public RegulatoryReportV041 save(RegulatoryReportV041 entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    @Transactional
    public void deleteById(Long id) {
        RegulatoryReportV041 entity = em.find(RegulatoryReportV041.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }
}
