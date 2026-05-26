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
 * RegulatoryReportV035Service — Business logic for RegulatoryReportV035 operations.
 */
@ApplicationScoped
public class RegulatoryReportV035Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV035Service.class);

    @Inject
    private RegulatoryReportV035Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV035> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV035 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV035> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV035 create(RegulatoryReportV035 entity) {
        LOG.info("Creating RegulatoryReportV035");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV035 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV035", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV035 update(Long id, RegulatoryReportV035 entity) {
        LOG.info("Updating RegulatoryReportV035 id: {}", id);
        RegulatoryReportV035 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV035 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV035 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV035", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV035 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV035", id.toString());
    }
}
