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
 * LoanV003Service — Business logic for LoanV003 operations.
 */
@ApplicationScoped
public class LoanV003Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV003Service.class);

    @Inject
    private LoanV003Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV003> findById(Long id) {
        LOG.debug("Finding LoanV003 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV003> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV003 create(LoanV003 entity) {
        LOG.info("Creating LoanV003");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV003 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV003", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV003 update(Long id, LoanV003 entity) {
        LOG.info("Updating LoanV003 id: {}", id);
        LoanV003 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV003 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV003 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV003", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV003 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV003", id.toString());
    }
}
