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
 * RegulatoryReportV009Service — Business logic for RegulatoryReportV009 operations.
 */
@ApplicationScoped
public class RegulatoryReportV009Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV009Service.class);

    @Inject
    private RegulatoryReportV009Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV009> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV009 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV009> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV009 create(RegulatoryReportV009 entity) {
        LOG.info("Creating RegulatoryReportV009");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV009 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV009", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV009 update(Long id, RegulatoryReportV009 entity) {
        LOG.info("Updating RegulatoryReportV009 id: {}", id);
        RegulatoryReportV009 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV009 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV009 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV009", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV009 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV009", id.toString());
    }
}
