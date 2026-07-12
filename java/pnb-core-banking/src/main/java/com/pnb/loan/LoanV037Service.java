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
 * LoanV037Service — Business logic for LoanV037 operations.
 */
@ApplicationScoped
public class LoanV037Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV037Service.class);

    @Inject
    private LoanV037Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV037> findById(Long id) {
        LOG.debug("Finding LoanV037 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV037> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV037 create(LoanV037 entity) {
        LOG.info("Creating LoanV037");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV037 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV037", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV037 update(Long id, LoanV037 entity) {
        LOG.info("Updating LoanV037 id: {}", id);
        LoanV037 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV037 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV037 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV037", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV037 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV037", id.toString());
    }
}
