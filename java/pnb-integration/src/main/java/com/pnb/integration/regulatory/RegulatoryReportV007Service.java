package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RegulatoryReportV007Service — Business logic for RegulatoryReportV007 operations.
 */
@ApplicationScoped
public class RegulatoryReportV007Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV007Service.class);

    @Inject
    private RegulatoryReportV007Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV007> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV007 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV007> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV007 create(RegulatoryReportV007 entity) {
        LOG.info("Creating RegulatoryReportV007");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV007 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV007", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV007 update(Long id, RegulatoryReportV007 entity) {
        LOG.info("Updating RegulatoryReportV007 id: {}", id);
        RegulatoryReportV007 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV007 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV007 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV007", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV007 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV007", id.toString());
    }
}
