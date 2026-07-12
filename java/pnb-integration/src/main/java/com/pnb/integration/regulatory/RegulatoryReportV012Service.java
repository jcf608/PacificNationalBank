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
 * RegulatoryReportV012Service — Business logic for RegulatoryReportV012 operations.
 */
@ApplicationScoped
public class RegulatoryReportV012Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV012Service.class);

    @Inject
    private RegulatoryReportV012Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV012> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV012 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV012> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV012 create(RegulatoryReportV012 entity) {
        LOG.info("Creating RegulatoryReportV012");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV012 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV012", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV012 update(Long id, RegulatoryReportV012 entity) {
        LOG.info("Updating RegulatoryReportV012 id: {}", id);
        RegulatoryReportV012 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV012 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV012 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV012", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV012 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV012", id.toString());
    }
}
