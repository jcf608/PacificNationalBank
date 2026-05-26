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
 * RegulatoryReportV044Service — Business logic for RegulatoryReportV044 operations.
 */
@ApplicationScoped
public class RegulatoryReportV044Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV044Service.class);

    @Inject
    private RegulatoryReportV044Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV044> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV044 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV044> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV044 create(RegulatoryReportV044 entity) {
        LOG.info("Creating RegulatoryReportV044");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV044 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV044", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV044 update(Long id, RegulatoryReportV044 entity) {
        LOG.info("Updating RegulatoryReportV044 id: {}", id);
        RegulatoryReportV044 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV044 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV044 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV044", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV044 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV044", id.toString());
    }
}
