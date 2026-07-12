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
 * LoanV021Service — Business logic for LoanV021 operations.
 */
@ApplicationScoped
public class LoanV021Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV021Service.class);

    @Inject
    private LoanV021Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV021> findById(Long id) {
        LOG.debug("Finding LoanV021 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV021> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV021 create(LoanV021 entity) {
        LOG.info("Creating LoanV021");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV021 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV021", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV021 update(Long id, LoanV021 entity) {
        LOG.info("Updating LoanV021 id: {}", id);
        LoanV021 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV021 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV021 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV021", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV021 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV021", id.toString());
    }
}
