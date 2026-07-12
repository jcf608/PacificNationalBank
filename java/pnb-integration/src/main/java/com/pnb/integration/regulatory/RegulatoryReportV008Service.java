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
 * RegulatoryReportV008Service — Business logic for RegulatoryReportV008 operations.
 */
@ApplicationScoped
public class RegulatoryReportV008Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV008Service.class);

    @Inject
    private RegulatoryReportV008Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV008> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV008 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV008> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV008 create(RegulatoryReportV008 entity) {
        LOG.info("Creating RegulatoryReportV008");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV008 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV008", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV008 update(Long id, RegulatoryReportV008 entity) {
        LOG.info("Updating RegulatoryReportV008 id: {}", id);
        RegulatoryReportV008 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV008 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV008 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV008", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV008 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV008", id.toString());
    }
}
