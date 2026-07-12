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
 * RegulatoryReportV010Service — Business logic for RegulatoryReportV010 operations.
 */
@ApplicationScoped
public class RegulatoryReportV010Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV010Service.class);

    @Inject
    private RegulatoryReportV010Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV010> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV010 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV010> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV010 create(RegulatoryReportV010 entity) {
        LOG.info("Creating RegulatoryReportV010");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV010 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV010", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV010 update(Long id, RegulatoryReportV010 entity) {
        LOG.info("Updating RegulatoryReportV010 id: {}", id);
        RegulatoryReportV010 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV010 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV010 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV010", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV010 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV010", id.toString());
    }
}
