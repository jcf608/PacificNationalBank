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
 * RegulatoryReportV032Service — Business logic for RegulatoryReportV032 operations.
 */
@ApplicationScoped
public class RegulatoryReportV032Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV032Service.class);

    @Inject
    private RegulatoryReportV032Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV032> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV032 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV032> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV032 create(RegulatoryReportV032 entity) {
        LOG.info("Creating RegulatoryReportV032");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV032 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV032", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV032 update(Long id, RegulatoryReportV032 entity) {
        LOG.info("Updating RegulatoryReportV032 id: {}", id);
        RegulatoryReportV032 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV032 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV032 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV032", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV032 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV032", id.toString());
    }
}
