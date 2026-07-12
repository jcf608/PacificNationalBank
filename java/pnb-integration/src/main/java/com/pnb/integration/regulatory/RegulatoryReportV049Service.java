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
 * RegulatoryReportV049Service — Business logic for RegulatoryReportV049 operations.
 */
@ApplicationScoped
public class RegulatoryReportV049Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV049Service.class);

    @Inject
    private RegulatoryReportV049Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV049> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV049 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV049> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV049 create(RegulatoryReportV049 entity) {
        LOG.info("Creating RegulatoryReportV049");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV049 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV049", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV049 update(Long id, RegulatoryReportV049 entity) {
        LOG.info("Updating RegulatoryReportV049 id: {}", id);
        RegulatoryReportV049 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV049 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV049 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV049", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV049 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV049", id.toString());
    }
}
