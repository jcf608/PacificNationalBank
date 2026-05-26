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
 * LoanV015Service — Business logic for LoanV015 operations.
 */
@ApplicationScoped
public class LoanV015Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV015Service.class);

    @Inject
    private LoanV015Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV015> findById(Long id) {
        LOG.debug("Finding LoanV015 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV015> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV015 create(LoanV015 entity) {
        LOG.info("Creating LoanV015");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV015 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV015", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV015 update(Long id, LoanV015 entity) {
        LOG.info("Updating LoanV015 id: {}", id);
        LoanV015 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV015 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV015 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV015", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV015 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV015", id.toString());
    }
}
