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
 * LoanV026Service — Business logic for LoanV026 operations.
 */
@ApplicationScoped
public class LoanV026Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV026Service.class);

    @Inject
    private LoanV026Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV026> findById(Long id) {
        LOG.debug("Finding LoanV026 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV026> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV026 create(LoanV026 entity) {
        LOG.info("Creating LoanV026");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV026 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV026", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV026 update(Long id, LoanV026 entity) {
        LOG.info("Updating LoanV026 id: {}", id);
        LoanV026 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV026 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV026 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV026", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV026 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV026", id.toString());
    }
}
