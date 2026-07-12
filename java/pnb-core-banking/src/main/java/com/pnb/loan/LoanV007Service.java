package com.pnb.loan;

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
 * LoanV007Service — Business logic for LoanV007 operations.
 */
@ApplicationScoped
public class LoanV007Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV007Service.class);

    @Inject
    private LoanV007Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV007> findById(Long id) {
        LOG.debug("Finding LoanV007 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV007> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV007 create(LoanV007 entity) {
        LOG.info("Creating LoanV007");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV007 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV007", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV007 update(Long id, LoanV007 entity) {
        LOG.info("Updating LoanV007 id: {}", id);
        LoanV007 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV007 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV007 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV007", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV007 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV007", id.toString());
    }
}
