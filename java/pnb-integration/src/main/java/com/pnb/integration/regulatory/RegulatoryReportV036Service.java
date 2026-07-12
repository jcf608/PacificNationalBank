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
 * RegulatoryReportV036Service — Business logic for RegulatoryReportV036 operations.
 */
@ApplicationScoped
public class RegulatoryReportV036Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV036Service.class);

    @Inject
    private RegulatoryReportV036Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV036> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV036 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV036> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV036 create(RegulatoryReportV036 entity) {
        LOG.info("Creating RegulatoryReportV036");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV036 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV036", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV036 update(Long id, RegulatoryReportV036 entity) {
        LOG.info("Updating RegulatoryReportV036 id: {}", id);
        RegulatoryReportV036 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV036 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV036 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV036", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV036 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV036", id.toString());
    }
}
