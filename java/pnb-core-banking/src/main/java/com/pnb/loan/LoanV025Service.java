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
 * LoanV025Service — Business logic for LoanV025 operations.
 */
@ApplicationScoped
public class LoanV025Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV025Service.class);

    @Inject
    private LoanV025Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV025> findById(Long id) {
        LOG.debug("Finding LoanV025 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV025> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV025 create(LoanV025 entity) {
        LOG.info("Creating LoanV025");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV025 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV025", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV025 update(Long id, LoanV025 entity) {
        LOG.info("Updating LoanV025 id: {}", id);
        LoanV025 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV025 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV025 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV025", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV025 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV025", id.toString());
    }
}
