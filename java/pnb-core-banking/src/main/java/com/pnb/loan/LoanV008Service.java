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
 * LoanV008Service — Business logic for LoanV008 operations.
 */
@ApplicationScoped
public class LoanV008Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV008Service.class);

    @Inject
    private LoanV008Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV008> findById(Long id) {
        LOG.debug("Finding LoanV008 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV008> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV008 create(LoanV008 entity) {
        LOG.info("Creating LoanV008");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV008 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV008", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV008 update(Long id, LoanV008 entity) {
        LOG.info("Updating LoanV008 id: {}", id);
        LoanV008 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV008 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV008 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV008", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV008 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV008", id.toString());
    }
}
