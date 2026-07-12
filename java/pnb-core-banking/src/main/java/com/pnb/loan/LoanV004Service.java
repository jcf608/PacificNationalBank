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
 * LoanV004Service — Business logic for LoanV004 operations.
 */
@ApplicationScoped
public class LoanV004Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV004Service.class);

    @Inject
    private LoanV004Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV004> findById(Long id) {
        LOG.debug("Finding LoanV004 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV004> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV004 create(LoanV004 entity) {
        LOG.info("Creating LoanV004");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV004 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV004", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV004 update(Long id, LoanV004 entity) {
        LOG.info("Updating LoanV004 id: {}", id);
        LoanV004 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV004 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV004 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV004", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV004 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV004", id.toString());
    }
}
