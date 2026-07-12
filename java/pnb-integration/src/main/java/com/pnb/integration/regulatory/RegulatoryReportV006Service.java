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
 * RegulatoryReportV006Service — Business logic for RegulatoryReportV006 operations.
 */
@ApplicationScoped
public class RegulatoryReportV006Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV006Service.class);

    @Inject
    private RegulatoryReportV006Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV006> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV006 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV006> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV006 create(RegulatoryReportV006 entity) {
        LOG.info("Creating RegulatoryReportV006");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV006 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV006", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV006 update(Long id, RegulatoryReportV006 entity) {
        LOG.info("Updating RegulatoryReportV006 id: {}", id);
        RegulatoryReportV006 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV006 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV006 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV006", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV006 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV006", id.toString());
    }
}
