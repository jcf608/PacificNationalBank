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
 * LoanV039Service — Business logic for LoanV039 operations.
 */
@ApplicationScoped
public class LoanV039Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV039Service.class);

    @Inject
    private LoanV039Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV039> findById(Long id) {
        LOG.debug("Finding LoanV039 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV039> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV039 create(LoanV039 entity) {
        LOG.info("Creating LoanV039");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV039 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV039", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV039 update(Long id, LoanV039 entity) {
        LOG.info("Updating LoanV039 id: {}", id);
        LoanV039 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV039 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV039 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV039", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV039 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV039", id.toString());
    }
}
