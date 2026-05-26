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
 * RegulatoryReportV027Service — Business logic for RegulatoryReportV027 operations.
 */
@ApplicationScoped
public class RegulatoryReportV027Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV027Service.class);

    @Inject
    private RegulatoryReportV027Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV027> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV027 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV027> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV027 create(RegulatoryReportV027 entity) {
        LOG.info("Creating RegulatoryReportV027");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV027 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV027", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV027 update(Long id, RegulatoryReportV027 entity) {
        LOG.info("Updating RegulatoryReportV027 id: {}", id);
        RegulatoryReportV027 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV027 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV027 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV027", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV027 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV027", id.toString());
    }
}
