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
 * RegulatoryReportV023Service — Business logic for RegulatoryReportV023 operations.
 */
@ApplicationScoped
public class RegulatoryReportV023Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV023Service.class);

    @Inject
    private RegulatoryReportV023Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV023> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV023 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV023> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV023 create(RegulatoryReportV023 entity) {
        LOG.info("Creating RegulatoryReportV023");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV023 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV023", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV023 update(Long id, RegulatoryReportV023 entity) {
        LOG.info("Updating RegulatoryReportV023 id: {}", id);
        RegulatoryReportV023 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV023 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV023 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV023", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV023 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV023", id.toString());
    }
}
