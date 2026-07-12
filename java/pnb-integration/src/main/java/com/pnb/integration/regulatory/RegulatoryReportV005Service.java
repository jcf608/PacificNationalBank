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
 * RegulatoryReportV005Service — Business logic for RegulatoryReportV005 operations.
 */
@ApplicationScoped
public class RegulatoryReportV005Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV005Service.class);

    @Inject
    private RegulatoryReportV005Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV005> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV005 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV005> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV005 create(RegulatoryReportV005 entity) {
        LOG.info("Creating RegulatoryReportV005");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV005 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV005", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV005 update(Long id, RegulatoryReportV005 entity) {
        LOG.info("Updating RegulatoryReportV005 id: {}", id);
        RegulatoryReportV005 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV005 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV005 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV005", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV005 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV005", id.toString());
    }
}
