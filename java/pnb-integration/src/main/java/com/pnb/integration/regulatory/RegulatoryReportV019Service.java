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
 * RegulatoryReportV019Service — Business logic for RegulatoryReportV019 operations.
 */
@ApplicationScoped
public class RegulatoryReportV019Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV019Service.class);

    @Inject
    private RegulatoryReportV019Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV019> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV019 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV019> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV019 create(RegulatoryReportV019 entity) {
        LOG.info("Creating RegulatoryReportV019");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV019 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV019", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV019 update(Long id, RegulatoryReportV019 entity) {
        LOG.info("Updating RegulatoryReportV019 id: {}", id);
        RegulatoryReportV019 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV019 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV019 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV019", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV019 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV019", id.toString());
    }
}
