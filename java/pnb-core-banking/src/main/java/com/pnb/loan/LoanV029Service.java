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
 * LoanV029Service — Business logic for LoanV029 operations.
 */
@ApplicationScoped
public class LoanV029Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV029Service.class);

    @Inject
    private LoanV029Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV029> findById(Long id) {
        LOG.debug("Finding LoanV029 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV029> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV029 create(LoanV029 entity) {
        LOG.info("Creating LoanV029");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV029 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV029", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV029 update(Long id, LoanV029 entity) {
        LOG.info("Updating LoanV029 id: {}", id);
        LoanV029 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV029 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV029 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV029", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV029 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV029", id.toString());
    }
}
