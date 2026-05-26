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
 * RegulatoryReportV033Service — Business logic for RegulatoryReportV033 operations.
 */
@ApplicationScoped
public class RegulatoryReportV033Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV033Service.class);

    @Inject
    private RegulatoryReportV033Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV033> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV033 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV033> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV033 create(RegulatoryReportV033 entity) {
        LOG.info("Creating RegulatoryReportV033");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV033 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV033", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV033 update(Long id, RegulatoryReportV033 entity) {
        LOG.info("Updating RegulatoryReportV033 id: {}", id);
        RegulatoryReportV033 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV033 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV033 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV033", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV033 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV033", id.toString());
    }
}
