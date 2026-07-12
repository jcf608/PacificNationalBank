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
 * LoanV033Service — Business logic for LoanV033 operations.
 */
@ApplicationScoped
public class LoanV033Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV033Service.class);

    @Inject
    private LoanV033Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV033> findById(Long id) {
        LOG.debug("Finding LoanV033 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV033> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV033 create(LoanV033 entity) {
        LOG.info("Creating LoanV033");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV033 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV033", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV033 update(Long id, LoanV033 entity) {
        LOG.info("Updating LoanV033 id: {}", id);
        LoanV033 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV033 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV033 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV033", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV033 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV033", id.toString());
    }
}
