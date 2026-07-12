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
 * LoanV000Service — Business logic for LoanV000 operations.
 */
@ApplicationScoped
public class LoanV000Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV000Service.class);

    @Inject
    private LoanV000Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV000> findById(Long id) {
        LOG.debug("Finding LoanV000 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV000> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV000 create(LoanV000 entity) {
        LOG.info("Creating LoanV000");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV000 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV000", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV000 update(Long id, LoanV000 entity) {
        LOG.info("Updating LoanV000 id: {}", id);
        LoanV000 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV000 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV000 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV000", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV000 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV000", id.toString());
    }
}
