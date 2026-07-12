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
 * LoanV001Service — Business logic for LoanV001 operations.
 */
@ApplicationScoped
public class LoanV001Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV001Service.class);

    @Inject
    private LoanV001Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV001> findById(Long id) {
        LOG.debug("Finding LoanV001 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV001> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV001 create(LoanV001 entity) {
        LOG.info("Creating LoanV001");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV001 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV001", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV001 update(Long id, LoanV001 entity) {
        LOG.info("Updating LoanV001 id: {}", id);
        LoanV001 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV001 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV001 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV001", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV001 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV001", id.toString());
    }
}
