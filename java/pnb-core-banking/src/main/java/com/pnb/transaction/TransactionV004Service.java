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
 * TransactionV004Service — Business logic for TransactionV004 operations.
 */
@ApplicationScoped
public class TransactionV004Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV004Service.class);

    @Inject
    private TransactionV004Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV004> findById(Long id) {
        LOG.debug("Finding TransactionV004 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV004> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV004 create(TransactionV004 entity) {
        LOG.info("Creating TransactionV004");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV004 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV004", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV004 update(Long id, TransactionV004 entity) {
        LOG.info("Updating TransactionV004 id: {}", id);
        TransactionV004 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV004 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV004 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV004", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV004 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV004", id.toString());
    }
}
