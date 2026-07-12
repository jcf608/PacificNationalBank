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
 * RegulatoryReportV018Service — Business logic for RegulatoryReportV018 operations.
 */
@ApplicationScoped
public class RegulatoryReportV018Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV018Service.class);

    @Inject
    private RegulatoryReportV018Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV018> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV018 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV018> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV018 create(RegulatoryReportV018 entity) {
        LOG.info("Creating RegulatoryReportV018");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV018 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV018", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV018 update(Long id, RegulatoryReportV018 entity) {
        LOG.info("Updating RegulatoryReportV018 id: {}", id);
        RegulatoryReportV018 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV018 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV018 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV018", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV018 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV018", id.toString());
    }
}
