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
 * LoanV020Service — Business logic for LoanV020 operations.
 */
@ApplicationScoped
public class LoanV020Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV020Service.class);

    @Inject
    private LoanV020Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV020> findById(Long id) {
        LOG.debug("Finding LoanV020 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV020> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV020 create(LoanV020 entity) {
        LOG.info("Creating LoanV020");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV020 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV020", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV020 update(Long id, LoanV020 entity) {
        LOG.info("Updating LoanV020 id: {}", id);
        LoanV020 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV020 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV020 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV020", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV020 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV020", id.toString());
    }
}
