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
 * LoanV027Service — Business logic for LoanV027 operations.
 */
@ApplicationScoped
public class LoanV027Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV027Service.class);

    @Inject
    private LoanV027Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV027> findById(Long id) {
        LOG.debug("Finding LoanV027 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV027> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV027 create(LoanV027 entity) {
        LOG.info("Creating LoanV027");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV027 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV027", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV027 update(Long id, LoanV027 entity) {
        LOG.info("Updating LoanV027 id: {}", id);
        LoanV027 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV027 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV027 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV027", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV027 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV027", id.toString());
    }
}
