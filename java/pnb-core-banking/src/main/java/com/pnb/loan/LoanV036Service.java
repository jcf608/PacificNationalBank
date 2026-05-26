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
 * LoanV036Service — Business logic for LoanV036 operations.
 */
@ApplicationScoped
public class LoanV036Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV036Service.class);

    @Inject
    private LoanV036Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV036> findById(Long id) {
        LOG.debug("Finding LoanV036 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV036> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV036 create(LoanV036 entity) {
        LOG.info("Creating LoanV036");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV036 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV036", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV036 update(Long id, LoanV036 entity) {
        LOG.info("Updating LoanV036 id: {}", id);
        LoanV036 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV036 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV036 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV036", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV036 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV036", id.toString());
    }
}
