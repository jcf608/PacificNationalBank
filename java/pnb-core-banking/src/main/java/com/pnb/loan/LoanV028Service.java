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
 * LoanV028Service — Business logic for LoanV028 operations.
 */
@ApplicationScoped
public class LoanV028Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV028Service.class);

    @Inject
    private LoanV028Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV028> findById(Long id) {
        LOG.debug("Finding LoanV028 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV028> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV028 create(LoanV028 entity) {
        LOG.info("Creating LoanV028");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV028 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV028", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV028 update(Long id, LoanV028 entity) {
        LOG.info("Updating LoanV028 id: {}", id);
        LoanV028 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV028 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV028 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV028", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV028 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV028", id.toString());
    }
}
