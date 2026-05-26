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
 * RegulatoryReportV011Service — Business logic for RegulatoryReportV011 operations.
 */
@ApplicationScoped
public class RegulatoryReportV011Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV011Service.class);

    @Inject
    private RegulatoryReportV011Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV011> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV011 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV011> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV011 create(RegulatoryReportV011 entity) {
        LOG.info("Creating RegulatoryReportV011");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV011 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV011", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV011 update(Long id, RegulatoryReportV011 entity) {
        LOG.info("Updating RegulatoryReportV011 id: {}", id);
        RegulatoryReportV011 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV011 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV011 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV011", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV011 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV011", id.toString());
    }
}
