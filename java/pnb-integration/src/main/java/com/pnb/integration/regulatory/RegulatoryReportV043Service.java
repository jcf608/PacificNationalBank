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
 * RegulatoryReportV043Service — Business logic for RegulatoryReportV043 operations.
 */
@ApplicationScoped
public class RegulatoryReportV043Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV043Service.class);

    @Inject
    private RegulatoryReportV043Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV043> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV043 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV043> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV043 create(RegulatoryReportV043 entity) {
        LOG.info("Creating RegulatoryReportV043");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV043 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV043", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV043 update(Long id, RegulatoryReportV043 entity) {
        LOG.info("Updating RegulatoryReportV043 id: {}", id);
        RegulatoryReportV043 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV043 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV043 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV043", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV043 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV043", id.toString());
    }
}
