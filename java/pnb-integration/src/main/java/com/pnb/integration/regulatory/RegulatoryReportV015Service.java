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
 * RegulatoryReportV015Service — Business logic for RegulatoryReportV015 operations.
 */
@ApplicationScoped
public class RegulatoryReportV015Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV015Service.class);

    @Inject
    private RegulatoryReportV015Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV015> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV015 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV015> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV015 create(RegulatoryReportV015 entity) {
        LOG.info("Creating RegulatoryReportV015");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV015 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV015", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV015 update(Long id, RegulatoryReportV015 entity) {
        LOG.info("Updating RegulatoryReportV015 id: {}", id);
        RegulatoryReportV015 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV015 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV015 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV015", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV015 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV015", id.toString());
    }
}
