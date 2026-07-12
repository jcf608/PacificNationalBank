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
 * RegulatoryReportV046Service — Business logic for RegulatoryReportV046 operations.
 */
@ApplicationScoped
public class RegulatoryReportV046Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV046Service.class);

    @Inject
    private RegulatoryReportV046Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV046> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV046 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV046> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV046 create(RegulatoryReportV046 entity) {
        LOG.info("Creating RegulatoryReportV046");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV046 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV046", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV046 update(Long id, RegulatoryReportV046 entity) {
        LOG.info("Updating RegulatoryReportV046 id: {}", id);
        RegulatoryReportV046 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV046 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV046 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV046", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV046 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV046", id.toString());
    }
}
