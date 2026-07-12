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
 * RegulatoryReportV037Service — Business logic for RegulatoryReportV037 operations.
 */
@ApplicationScoped
public class RegulatoryReportV037Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV037Service.class);

    @Inject
    private RegulatoryReportV037Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV037> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV037 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV037> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV037 create(RegulatoryReportV037 entity) {
        LOG.info("Creating RegulatoryReportV037");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV037 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV037", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV037 update(Long id, RegulatoryReportV037 entity) {
        LOG.info("Updating RegulatoryReportV037 id: {}", id);
        RegulatoryReportV037 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV037 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV037 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV037", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV037 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV037", id.toString());
    }
}
