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
 * RegulatoryReportV003Service — Business logic for RegulatoryReportV003 operations.
 */
@ApplicationScoped
public class RegulatoryReportV003Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV003Service.class);

    @Inject
    private RegulatoryReportV003Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV003> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV003 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV003> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV003 create(RegulatoryReportV003 entity) {
        LOG.info("Creating RegulatoryReportV003");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV003 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV003", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV003 update(Long id, RegulatoryReportV003 entity) {
        LOG.info("Updating RegulatoryReportV003 id: {}", id);
        RegulatoryReportV003 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV003 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV003 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV003", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV003 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV003", id.toString());
    }
}
