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
 * LoanV005Service — Business logic for LoanV005 operations.
 */
@ApplicationScoped
public class LoanV005Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV005Service.class);

    @Inject
    private LoanV005Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV005> findById(Long id) {
        LOG.debug("Finding LoanV005 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV005> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV005 create(LoanV005 entity) {
        LOG.info("Creating LoanV005");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV005 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV005", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV005 update(Long id, LoanV005 entity) {
        LOG.info("Updating LoanV005 id: {}", id);
        LoanV005 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV005 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV005 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV005", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV005 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV005", id.toString());
    }
}
