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
 * RegulatoryReportV022Service — Business logic for RegulatoryReportV022 operations.
 */
@ApplicationScoped
public class RegulatoryReportV022Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV022Service.class);

    @Inject
    private RegulatoryReportV022Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV022> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV022 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV022> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV022 create(RegulatoryReportV022 entity) {
        LOG.info("Creating RegulatoryReportV022");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV022 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV022", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV022 update(Long id, RegulatoryReportV022 entity) {
        LOG.info("Updating RegulatoryReportV022 id: {}", id);
        RegulatoryReportV022 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV022 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV022 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV022", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV022 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV022", id.toString());
    }
}
