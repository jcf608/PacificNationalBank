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
 * RegulatoryReportV000Service — Business logic for RegulatoryReportV000 operations.
 */
@ApplicationScoped
public class RegulatoryReportV000Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV000Service.class);

    @Inject
    private RegulatoryReportV000Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV000> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV000 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV000> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV000 create(RegulatoryReportV000 entity) {
        LOG.info("Creating RegulatoryReportV000");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV000 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV000", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV000 update(Long id, RegulatoryReportV000 entity) {
        LOG.info("Updating RegulatoryReportV000 id: {}", id);
        RegulatoryReportV000 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV000 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV000 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV000", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV000 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV000", id.toString());
    }
}
