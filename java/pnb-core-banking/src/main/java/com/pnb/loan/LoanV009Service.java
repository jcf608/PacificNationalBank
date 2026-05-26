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
 * LoanV009Service — Business logic for LoanV009 operations.
 */
@ApplicationScoped
public class LoanV009Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV009Service.class);

    @Inject
    private LoanV009Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV009> findById(Long id) {
        LOG.debug("Finding LoanV009 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV009> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV009 create(LoanV009 entity) {
        LOG.info("Creating LoanV009");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV009 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV009", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV009 update(Long id, LoanV009 entity) {
        LOG.info("Updating LoanV009 id: {}", id);
        LoanV009 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV009 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV009 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV009", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV009 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV009", id.toString());
    }
}
