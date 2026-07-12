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
 * LoanV034Service — Business logic for LoanV034 operations.
 */
@ApplicationScoped
public class LoanV034Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV034Service.class);

    @Inject
    private LoanV034Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV034> findById(Long id) {
        LOG.debug("Finding LoanV034 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV034> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV034 create(LoanV034 entity) {
        LOG.info("Creating LoanV034");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV034 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV034", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV034 update(Long id, LoanV034 entity) {
        LOG.info("Updating LoanV034 id: {}", id);
        LoanV034 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV034 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV034 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV034", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV034 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV034", id.toString());
    }
}
