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
 * RegulatoryReportV031Service — Business logic for RegulatoryReportV031 operations.
 */
@ApplicationScoped
public class RegulatoryReportV031Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV031Service.class);

    @Inject
    private RegulatoryReportV031Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV031> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV031 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV031> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV031 create(RegulatoryReportV031 entity) {
        LOG.info("Creating RegulatoryReportV031");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV031 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV031", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV031 update(Long id, RegulatoryReportV031 entity) {
        LOG.info("Updating RegulatoryReportV031 id: {}", id);
        RegulatoryReportV031 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV031 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV031 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV031", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV031 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV031", id.toString());
    }
}
