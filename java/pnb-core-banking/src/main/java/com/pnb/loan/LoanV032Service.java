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
 * LoanV032Service — Business logic for LoanV032 operations.
 */
@ApplicationScoped
public class LoanV032Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV032Service.class);

    @Inject
    private LoanV032Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV032> findById(Long id) {
        LOG.debug("Finding LoanV032 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV032> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV032 create(LoanV032 entity) {
        LOG.info("Creating LoanV032");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV032 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV032", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV032 update(Long id, LoanV032 entity) {
        LOG.info("Updating LoanV032 id: {}", id);
        LoanV032 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV032 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV032 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV032", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV032 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV032", id.toString());
    }
}
