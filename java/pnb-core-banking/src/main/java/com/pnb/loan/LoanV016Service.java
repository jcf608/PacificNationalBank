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
 * LoanV016Service — Business logic for LoanV016 operations.
 */
@ApplicationScoped
public class LoanV016Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV016Service.class);

    @Inject
    private LoanV016Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV016> findById(Long id) {
        LOG.debug("Finding LoanV016 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV016> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV016 create(LoanV016 entity) {
        LOG.info("Creating LoanV016");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV016 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV016", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV016 update(Long id, LoanV016 entity) {
        LOG.info("Updating LoanV016 id: {}", id);
        LoanV016 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV016 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV016 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV016", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV016 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV016", id.toString());
    }
}
