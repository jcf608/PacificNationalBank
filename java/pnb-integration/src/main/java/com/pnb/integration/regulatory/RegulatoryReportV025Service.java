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
 * RegulatoryReportV025Service — Business logic for RegulatoryReportV025 operations.
 */
@ApplicationScoped
public class RegulatoryReportV025Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV025Service.class);

    @Inject
    private RegulatoryReportV025Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV025> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV025 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV025> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV025 create(RegulatoryReportV025 entity) {
        LOG.info("Creating RegulatoryReportV025");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV025 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV025", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV025 update(Long id, RegulatoryReportV025 entity) {
        LOG.info("Updating RegulatoryReportV025 id: {}", id);
        RegulatoryReportV025 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV025 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV025 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV025", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV025 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV025", id.toString());
    }
}
