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
 * RegulatoryReportV028Service — Business logic for RegulatoryReportV028 operations.
 */
@ApplicationScoped
public class RegulatoryReportV028Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV028Service.class);

    @Inject
    private RegulatoryReportV028Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV028> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV028 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV028> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV028 create(RegulatoryReportV028 entity) {
        LOG.info("Creating RegulatoryReportV028");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV028 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV028", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV028 update(Long id, RegulatoryReportV028 entity) {
        LOG.info("Updating RegulatoryReportV028 id: {}", id);
        RegulatoryReportV028 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV028 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV028 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV028", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV028 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV028", id.toString());
    }
}
