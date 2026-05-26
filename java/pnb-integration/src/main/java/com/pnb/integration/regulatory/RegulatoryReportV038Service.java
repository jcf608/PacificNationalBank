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
 * RegulatoryReportV038Service — Business logic for RegulatoryReportV038 operations.
 */
@ApplicationScoped
public class RegulatoryReportV038Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV038Service.class);

    @Inject
    private RegulatoryReportV038Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV038> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV038 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV038> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV038 create(RegulatoryReportV038 entity) {
        LOG.info("Creating RegulatoryReportV038");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV038 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV038", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV038 update(Long id, RegulatoryReportV038 entity) {
        LOG.info("Updating RegulatoryReportV038 id: {}", id);
        RegulatoryReportV038 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV038 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV038 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV038", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV038 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV038", id.toString());
    }
}
