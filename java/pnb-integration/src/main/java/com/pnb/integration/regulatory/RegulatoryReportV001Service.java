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
 * RegulatoryReportV001Service — Business logic for RegulatoryReportV001 operations.
 */
@ApplicationScoped
public class RegulatoryReportV001Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV001Service.class);

    @Inject
    private RegulatoryReportV001Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV001> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV001 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV001> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV001 create(RegulatoryReportV001 entity) {
        LOG.info("Creating RegulatoryReportV001");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV001 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV001", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV001 update(Long id, RegulatoryReportV001 entity) {
        LOG.info("Updating RegulatoryReportV001 id: {}", id);
        RegulatoryReportV001 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV001 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV001 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV001", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV001 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV001", id.toString());
    }
}
