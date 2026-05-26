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
 * TransactionV000Service — Business logic for TransactionV000 operations.
 */
@ApplicationScoped
public class TransactionV000Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV000Service.class);

    @Inject
    private TransactionV000Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV000> findById(Long id) {
        LOG.debug("Finding TransactionV000 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV000> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV000 create(TransactionV000 entity) {
        LOG.info("Creating TransactionV000");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV000 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV000", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV000 update(Long id, TransactionV000 entity) {
        LOG.info("Updating TransactionV000 id: {}", id);
        TransactionV000 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV000 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV000 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV000", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV000 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV000", id.toString());
    }
}
