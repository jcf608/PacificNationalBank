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
 * RegulatoryReportV040Service — Business logic for RegulatoryReportV040 operations.
 */
@ApplicationScoped
public class RegulatoryReportV040Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV040Service.class);

    @Inject
    private RegulatoryReportV040Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV040> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV040 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV040> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV040 create(RegulatoryReportV040 entity) {
        LOG.info("Creating RegulatoryReportV040");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV040 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV040", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV040 update(Long id, RegulatoryReportV040 entity) {
        LOG.info("Updating RegulatoryReportV040 id: {}", id);
        RegulatoryReportV040 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV040 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV040 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV040", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV040 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV040", id.toString());
    }
}
