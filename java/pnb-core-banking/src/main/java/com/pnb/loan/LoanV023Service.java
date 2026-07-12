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
 * LoanV023Service — Business logic for LoanV023 operations.
 */
@ApplicationScoped
public class LoanV023Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV023Service.class);

    @Inject
    private LoanV023Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV023> findById(Long id) {
        LOG.debug("Finding LoanV023 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV023> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV023 create(LoanV023 entity) {
        LOG.info("Creating LoanV023");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV023 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV023", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV023 update(Long id, LoanV023 entity) {
        LOG.info("Updating LoanV023 id: {}", id);
        LoanV023 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV023 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV023 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV023", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV023 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV023", id.toString());
    }
}
