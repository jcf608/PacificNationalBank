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
 * TransactionV026Service — Business logic for TransactionV026 operations.
 */
@ApplicationScoped
public class TransactionV026Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV026Service.class);

    @Inject
    private TransactionV026Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV026> findById(Long id) {
        LOG.debug("Finding TransactionV026 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV026> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV026 create(TransactionV026 entity) {
        LOG.info("Creating TransactionV026");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV026 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV026", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV026 update(Long id, TransactionV026 entity) {
        LOG.info("Updating TransactionV026 id: {}", id);
        TransactionV026 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV026 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV026 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV026", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV026 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV026", id.toString());
    }
}
