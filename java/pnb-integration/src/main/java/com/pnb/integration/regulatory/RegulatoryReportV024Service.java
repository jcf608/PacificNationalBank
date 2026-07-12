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
 * RegulatoryReportV024Service — Business logic for RegulatoryReportV024 operations.
 */
@ApplicationScoped
public class RegulatoryReportV024Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV024Service.class);

    @Inject
    private RegulatoryReportV024Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV024> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV024 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV024> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV024 create(RegulatoryReportV024 entity) {
        LOG.info("Creating RegulatoryReportV024");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV024 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV024", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV024 update(Long id, RegulatoryReportV024 entity) {
        LOG.info("Updating RegulatoryReportV024 id: {}", id);
        RegulatoryReportV024 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV024 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV024 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV024", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV024 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV024", id.toString());
    }
}
