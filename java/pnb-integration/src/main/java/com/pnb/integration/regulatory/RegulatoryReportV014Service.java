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
 * RegulatoryReportV014Service — Business logic for RegulatoryReportV014 operations.
 */
@ApplicationScoped
public class RegulatoryReportV014Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV014Service.class);

    @Inject
    private RegulatoryReportV014Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV014> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV014 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV014> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV014 create(RegulatoryReportV014 entity) {
        LOG.info("Creating RegulatoryReportV014");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV014 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV014", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV014 update(Long id, RegulatoryReportV014 entity) {
        LOG.info("Updating RegulatoryReportV014 id: {}", id);
        RegulatoryReportV014 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV014 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV014 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV014", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV014 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV014", id.toString());
    }
}
