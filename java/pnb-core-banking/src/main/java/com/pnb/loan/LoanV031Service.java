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
 * LoanV031Service — Business logic for LoanV031 operations.
 */
@ApplicationScoped
public class LoanV031Service {

    private static final Logger LOG = LoggerFactory.getLogger(LoanV031Service.class);

    @Inject
    private LoanV031Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<LoanV031> findById(Long id) {
        LOG.debug("Finding LoanV031 by id: {}", id);
        return repository.findById(id);
    }

    public List<LoanV031> findAll() {
        return repository.findAll();
    }

    @Transactional
    public LoanV031 create(LoanV031 entity) {
        LOG.info("Creating LoanV031");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV031 saved = repository.save(entity);
        auditService.log("CREATE", "LoanV031", saved.getId().toString());
        return saved;
    }

    @Transactional
    public LoanV031 update(Long id, LoanV031 entity) {
        LOG.info("Updating LoanV031 id: {}", id);
        LoanV031 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("LoanV031 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        LoanV031 updated = repository.save(entity);
        auditService.log("UPDATE", "LoanV031", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting LoanV031 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "LoanV031", id.toString());
    }
}
