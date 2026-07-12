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
 * LoanV019Service — Business logic for LoanV019 operations.
 */
@ApplicationScoped
public class LoanV019Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV019Service.class);

    @Inject
    private LoanV019Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV019> findById(Long id) {
        LOG.debug("Finding LoanV019 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV019> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV019 create(LoanV019 entity) {
        LOG.info("Creating LoanV019");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV019 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV019", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV019 update(Long id, LoanV019 entity) {
        LOG.info("Updating LoanV019 id: {}", id);
        LoanV019 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV019 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV019 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV019", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV019 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV019", id.toString());
    }
}
