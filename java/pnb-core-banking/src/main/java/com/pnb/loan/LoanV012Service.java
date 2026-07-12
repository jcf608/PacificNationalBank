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
 * LoanV012Service — Business logic for LoanV012 operations.
 */
@ApplicationScoped
public class LoanV012Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV012Service.class);

    @Inject
    private LoanV012Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV012> findById(Long id) {
        LOG.debug("Finding LoanV012 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV012> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV012 create(LoanV012 entity) {
        LOG.info("Creating LoanV012");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV012 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV012", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV012 update(Long id, LoanV012 entity) {
        LOG.info("Updating LoanV012 id: {}", id);
        LoanV012 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV012 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV012 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV012", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV012 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV012", id.toString());
    }
}
