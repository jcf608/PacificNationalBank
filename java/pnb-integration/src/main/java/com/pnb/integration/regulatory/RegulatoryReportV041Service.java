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
 * RegulatoryReportV041Service — Business logic for RegulatoryReportV041 operations.
 */
@ApplicationScoped
public class RegulatoryReportV041Service {

    private static final Logger LOG = LoggerFactory.getLogger(RegulatoryReportV041Service.class);

    @Inject
    private RegulatoryReportV041Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<RegulatoryReportV041> findById(Long id) {
        LOG.debug("Finding RegulatoryReportV041 by id: {}", id);
        return repository.findById(id);
    }

    public List<RegulatoryReportV041> findAll() {
        return repository.findAll();
    }

    @Transactional
    public RegulatoryReportV041 create(RegulatoryReportV041 entity) {
        LOG.info("Creating RegulatoryReportV041");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV041 saved = repository.save(entity);
        auditService.log("CREATE", "RegulatoryReportV041", saved.getId().toString());
        return saved;
    }

    @Transactional
    public RegulatoryReportV041 update(Long id, RegulatoryReportV041 entity) {
        LOG.info("Updating RegulatoryReportV041 id: {}", id);
        RegulatoryReportV041 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("RegulatoryReportV041 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        RegulatoryReportV041 updated = repository.save(entity);
        auditService.log("UPDATE", "RegulatoryReportV041", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting RegulatoryReportV041 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "RegulatoryReportV041", id.toString());
    }
}
