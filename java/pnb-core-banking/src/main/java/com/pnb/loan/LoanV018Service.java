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
 * LoanV018Service — Business logic for LoanV018 operations.
 */
@ApplicationScoped
public class LoanV018Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV018Service.class);

    @Inject
    private LoanV018Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV018> findById(Long id) {
        LOG.debug("Finding LoanV018 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV018> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV018 create(LoanV018 entity) {
        LOG.info("Creating LoanV018");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV018 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV018", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV018 update(Long id, LoanV018 entity) {
        LOG.info("Updating LoanV018 id: {}", id);
        LoanV018 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV018 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV018 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV018", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV018 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV018", id.toString());
    }
}
