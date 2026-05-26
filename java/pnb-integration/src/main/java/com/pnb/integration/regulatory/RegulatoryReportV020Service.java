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
 * RegulatoryReportV020Service — Business logic for RegulatoryReportV020 operations.
 */
@ApplicationScoped
public class RegulatoryReportV020Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV020Service.class);

    @Inject
    private RegulatoryReportV020Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV020> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV020 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV020> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV020 create(RegulatoryReportV020 entity) {
        LOG.info("Creating RegulatoryReportV020");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV020 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV020", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV020 update(Long id, RegulatoryReportV020 entity) {
        LOG.info("Updating RegulatoryReportV020 id: {}", id);
        RegulatoryReportV020 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV020 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV020 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV020", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV020 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV020", id.toString());
    }
}
