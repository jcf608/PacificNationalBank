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
 * RegulatoryReportV039Service — Business logic for RegulatoryReportV039 operations.
 */
@ApplicationScoped
public class RegulatoryReportV039Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV039Service.class);

    @Inject
    private RegulatoryReportV039Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV039> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV039 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV039> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV039 create(RegulatoryReportV039 entity) {
        LOG.info("Creating RegulatoryReportV039");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV039 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV039", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV039 update(Long id, RegulatoryReportV039 entity) {
        LOG.info("Updating RegulatoryReportV039 id: {}", id);
        RegulatoryReportV039 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV039 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV039 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV039", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV039 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV039", id.toString());
    }
}
