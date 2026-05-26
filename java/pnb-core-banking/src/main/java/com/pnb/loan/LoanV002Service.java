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
 * LoanV002Service — Business logic for LoanV002 operations.
 */
@ApplicationScoped
public class LoanV002Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV002Service.class);

    @Inject
    private LoanV002Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV002> findById(Long id) {
        LOG.debug("Finding LoanV002 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV002> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV002 create(LoanV002 entity) {
        LOG.info("Creating LoanV002");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV002 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV002", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV002 update(Long id, LoanV002 entity) {
        LOG.info("Updating LoanV002 id: {}", id);
        LoanV002 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV002 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV002 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV002", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV002 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV002", id.toString());
    }
}
