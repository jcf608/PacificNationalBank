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
 * LoanV013Service — Business logic for LoanV013 operations.
 */
@ApplicationScoped
public class LoanV013Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV013Service.class);

    @Inject
    private LoanV013Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV013> findById(Long id) {
        LOG.debug("Finding LoanV013 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV013> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV013 create(LoanV013 entity) {
        LOG.info("Creating LoanV013");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV013 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV013", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV013 update(Long id, LoanV013 entity) {
        LOG.info("Updating LoanV013 id: {}", id);
        LoanV013 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV013 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV013 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV013", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV013 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV013", id.toString());
    }
}
