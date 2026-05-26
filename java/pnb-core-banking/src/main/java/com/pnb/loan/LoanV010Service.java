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
 * LoanV010Service — Business logic for LoanV010 operations.
 */
@ApplicationScoped
public class LoanV010Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV010Service.class);

    @Inject
    private LoanV010Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV010> findById(Long id) {
        LOG.debug("Finding LoanV010 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV010> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV010 create(LoanV010 entity) {
        LOG.info("Creating LoanV010");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV010 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV010", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV010 update(Long id, LoanV010 entity) {
        LOG.info("Updating LoanV010 id: {}", id);
        LoanV010 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV010 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV010 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV010", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV010 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV010", id.toString());
    }
}
