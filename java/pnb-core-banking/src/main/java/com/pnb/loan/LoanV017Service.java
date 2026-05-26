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
 * LoanV017Service — Business logic for LoanV017 operations.
 */
@ApplicationScoped
public class LoanV017Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV017Service.class);

    @Inject
    private LoanV017Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV017> findById(Long id) {
        LOG.debug("Finding LoanV017 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV017> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV017 create(LoanV017 entity) {
        LOG.info("Creating LoanV017");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV017 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV017", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV017 update(Long id, LoanV017 entity) {
        LOG.info("Updating LoanV017 id: {}", id);
        LoanV017 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV017 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV017 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV017", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV017 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV017", id.toString());
    }
}
