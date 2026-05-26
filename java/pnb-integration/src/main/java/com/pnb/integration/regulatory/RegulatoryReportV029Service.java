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
 * RegulatoryReportV029Service — Business logic for RegulatoryReportV029 operations.
 */
@ApplicationScoped
public class RegulatoryReportV029Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV029Service.class);

    @Inject
    private RegulatoryReportV029Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV029> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV029 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV029> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV029 create(RegulatoryReportV029 entity) {
        LOG.info("Creating RegulatoryReportV029");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV029 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV029", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV029 update(Long id, RegulatoryReportV029 entity) {
        LOG.info("Updating RegulatoryReportV029 id: {}", id);
        RegulatoryReportV029 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV029 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV029 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV029", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV029 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV029", id.toString());
    }
}
