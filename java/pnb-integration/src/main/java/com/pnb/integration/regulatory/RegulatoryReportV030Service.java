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
 * RegulatoryReportV030Service — Business logic for RegulatoryReportV030 operations.
 */
@ApplicationScoped
public class RegulatoryReportV030Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV030Service.class);

    @Inject
    private RegulatoryReportV030Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV030> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV030 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV030> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV030 create(RegulatoryReportV030 entity) {
        LOG.info("Creating RegulatoryReportV030");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV030 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV030", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV030 update(Long id, RegulatoryReportV030 entity) {
        LOG.info("Updating RegulatoryReportV030 id: {}", id);
        RegulatoryReportV030 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV030 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV030 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV030", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV030 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV030", id.toString());
    }
}
