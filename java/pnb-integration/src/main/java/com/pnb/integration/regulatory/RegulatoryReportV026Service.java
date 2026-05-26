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
 * RegulatoryReportV026Service — Business logic for RegulatoryReportV026 operations.
 */
@ApplicationScoped
public class RegulatoryReportV026Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV026Service.class);

    @Inject
    private RegulatoryReportV026Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV026> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV026 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV026> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV026 create(RegulatoryReportV026 entity) {
        LOG.info("Creating RegulatoryReportV026");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV026 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV026", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV026 update(Long id, RegulatoryReportV026 entity) {
        LOG.info("Updating RegulatoryReportV026 id: {}", id);
        RegulatoryReportV026 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV026 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV026 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV026", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV026 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV026", id.toString());
    }
}
