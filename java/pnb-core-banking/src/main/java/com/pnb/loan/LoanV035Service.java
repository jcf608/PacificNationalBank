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
 * LoanV035Service — Business logic for LoanV035 operations.
 */
@ApplicationScoped
public class LoanV035Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV035Service.class);

    @Inject
    private LoanV035Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV035> findById(Long id) {
        LOG.debug("Finding LoanV035 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV035> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV035 create(LoanV035 entity) {
        LOG.info("Creating LoanV035");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV035 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV035", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV035 update(Long id, LoanV035 entity) {
        LOG.info("Updating LoanV035 id: {}", id);
        LoanV035 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV035 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV035 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV035", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV035 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV035", id.toString());
    }
}
