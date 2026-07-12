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
 * RegulatoryReportV042Service — Business logic for RegulatoryReportV042 operations.
 */
@ApplicationScoped
public class RegulatoryReportV042Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV042Service.class);

    @Inject
    private RegulatoryReportV042Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV042> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV042 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV042> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV042 create(RegulatoryReportV042 entity) {
        LOG.info("Creating RegulatoryReportV042");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV042 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV042", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV042 update(Long id, RegulatoryReportV042 entity) {
        LOG.info("Updating RegulatoryReportV042 id: {}", id);
        RegulatoryReportV042 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV042 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV042 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV042", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV042 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV042", id.toString());
    }
}
