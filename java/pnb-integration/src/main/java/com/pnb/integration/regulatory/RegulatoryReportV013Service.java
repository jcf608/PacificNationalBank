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
 * RegulatoryReportV013Service — Business logic for RegulatoryReportV013 operations.
 */
@ApplicationScoped
public class RegulatoryReportV013Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV013Service.class);

    @Inject
    private RegulatoryReportV013Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV013> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV013 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV013> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV013 create(RegulatoryReportV013 entity) {
        LOG.info("Creating RegulatoryReportV013");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV013 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV013", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV013 update(Long id, RegulatoryReportV013 entity) {
        LOG.info("Updating RegulatoryReportV013 id: {}", id);
        RegulatoryReportV013 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV013 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV013 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV013", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV013 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV013", id.toString());
    }
}
