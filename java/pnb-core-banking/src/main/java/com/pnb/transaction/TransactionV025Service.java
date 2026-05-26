package com.pnb.transaction;

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
 * TransactionV025Service — Business logic for TransactionV025 operations.
 */
@ApplicationScoped
public class TransactionV025Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV025Service.class);

    @Inject
    private TransactionV025Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV025> findById(Long id) {
        LOG.debug("Finding TransactionV025 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV025> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV025 create(TransactionV025 entity) {
        LOG.info("Creating TransactionV025");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV025 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV025", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV025 update(Long id, TransactionV025 entity) {
        LOG.info("Updating TransactionV025 id: {}", id);
        TransactionV025 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV025 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV025 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV025", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV025 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV025", id.toString());
    }
}
