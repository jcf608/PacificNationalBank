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
 * TransactionV008Service — Business logic for TransactionV008 operations.
 */
@ApplicationScoped
public class TransactionV008Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV008Service.class);

    @Inject
    private TransactionV008Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV008> findById(Long id) {
        LOG.debug("Finding TransactionV008 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV008> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV008 create(TransactionV008 entity) {
        LOG.info("Creating TransactionV008");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV008 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV008", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV008 update(Long id, TransactionV008 entity) {
        LOG.info("Updating TransactionV008 id: {}", id);
        TransactionV008 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV008 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV008 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV008", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV008 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV008", id.toString());
    }
}
