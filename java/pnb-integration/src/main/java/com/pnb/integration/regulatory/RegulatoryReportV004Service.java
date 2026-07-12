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
 * RegulatoryReportV004Service — Business logic for RegulatoryReportV004 operations.
 */
@ApplicationScoped
public class RegulatoryReportV004Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV004Service.class);

    @Inject
    private RegulatoryReportV004Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV004> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV004 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV004> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV004 create(RegulatoryReportV004 entity) {
        LOG.info("Creating RegulatoryReportV004");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV004 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV004", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV004 update(Long id, RegulatoryReportV004 entity) {
        LOG.info("Updating RegulatoryReportV004 id: {}", id);
        RegulatoryReportV004 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV004 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV004 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV004", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV004 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV004", id.toString());
    }
}
