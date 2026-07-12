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
 * TransactionV015Service — Business logic for TransactionV015 operations.
 */
@ApplicationScoped
public class TransactionV015Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV015Service.class);

    @Inject
    private TransactionV015Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV015> findById(Long id) {
        LOG.debug("Finding TransactionV015 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV015> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV015 create(TransactionV015 entity) {
        LOG.info("Creating TransactionV015");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV015 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV015", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV015 update(Long id, TransactionV015 entity) {
        LOG.info("Updating TransactionV015 id: {}", id);
        TransactionV015 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV015 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV015 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV015", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV015 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV015", id.toString());
    }
}
