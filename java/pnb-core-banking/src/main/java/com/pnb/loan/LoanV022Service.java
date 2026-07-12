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
 * LoanV022Service — Business logic for LoanV022 operations.
 */
@ApplicationScoped
public class LoanV022Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV022Service.class);

    @Inject
    private LoanV022Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV022> findById(Long id) {
        LOG.debug("Finding LoanV022 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV022> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV022 create(LoanV022 entity) {
        LOG.info("Creating LoanV022");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV022 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV022", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV022 update(Long id, LoanV022 entity) {
        LOG.info("Updating LoanV022 id: {}", id);
        LoanV022 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV022 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV022 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV022", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV022 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV022", id.toString());
    }
}
