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
 * LoanV006Service — Business logic for LoanV006 operations.
 */
@ApplicationScoped
public class LoanV006Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV006Service.class);

    @Inject
    private LoanV006Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV006> findById(Long id) {
        LOG.debug("Finding LoanV006 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV006> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV006 create(LoanV006 entity) {
        LOG.info("Creating LoanV006");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV006 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV006", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV006 update(Long id, LoanV006 entity) {
        LOG.info("Updating LoanV006 id: {}", id);
        LoanV006 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV006 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV006 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV006", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV006 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV006", id.toString());
    }
}
