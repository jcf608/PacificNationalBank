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
 * RegulatoryReportV017Service — Business logic for RegulatoryReportV017 operations.
 */
@ApplicationScoped
public class RegulatoryReportV017Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV017Service.class);

    @Inject
    private RegulatoryReportV017Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV017> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV017 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV017> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV017 create(RegulatoryReportV017 entity) {
        LOG.info("Creating RegulatoryReportV017");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV017 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV017", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV017 update(Long id, RegulatoryReportV017 entity) {
        LOG.info("Updating RegulatoryReportV017 id: {}", id);
        RegulatoryReportV017 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV017 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV017 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV017", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV017 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV017", id.toString());
    }
}
