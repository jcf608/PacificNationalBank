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
 * RegulatoryReportV045Service — Business logic for RegulatoryReportV045 operations.
 */
@ApplicationScoped
public class RegulatoryReportV045Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV045Service.class);

    @Inject
    private RegulatoryReportV045Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV045> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV045 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV045> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV045 create(RegulatoryReportV045 entity) {
        LOG.info("Creating RegulatoryReportV045");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV045 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV045", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV045 update(Long id, RegulatoryReportV045 entity) {
        LOG.info("Updating RegulatoryReportV045 id: {}", id);
        RegulatoryReportV045 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV045 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV045 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV045", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV045 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV045", id.toString());
    }
}
