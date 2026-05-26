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
 * LoanV038Service — Business logic for LoanV038 operations.
 */
@ApplicationScoped
public class LoanV038Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV038Service.class);

    @Inject
    private LoanV038Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV038> findById(Long id) {
        LOG.debug("Finding LoanV038 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV038> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV038 create(LoanV038 entity) {
        LOG.info("Creating LoanV038");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV038 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV038", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV038 update(Long id, LoanV038 entity) {
        LOG.info("Updating LoanV038 id: {}", id);
        LoanV038 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV038 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV038 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV038", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV038 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV038", id.toString());
    }
}
