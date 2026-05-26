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
 * LoanV030Service — Business logic for LoanV030 operations.
 */
@ApplicationScoped
public class LoanV030Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV030Service.class);

    @Inject
    private LoanV030Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV030> findById(Long id) {
        LOG.debug("Finding LoanV030 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV030> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV030 create(LoanV030 entity) {
        LOG.info("Creating LoanV030");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV030 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV030", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV030 update(Long id, LoanV030 entity) {
        LOG.info("Updating LoanV030 id: {}", id);
        LoanV030 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV030 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV030 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV030", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV030 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV030", id.toString());
    }
}
