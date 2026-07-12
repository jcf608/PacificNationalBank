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
 * TransactionV003Service — Business logic for TransactionV003 operations.
 */
@ApplicationScoped
public class TransactionV003Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV003Service.class);

    @Inject
    private TransactionV003Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV003> findById(Long id) {
        LOG.debug("Finding TransactionV003 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV003> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV003 create(TransactionV003 entity) {
        LOG.info("Creating TransactionV003");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV003 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV003", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV003 update(Long id, TransactionV003 entity) {
        LOG.info("Updating TransactionV003 id: {}", id);
        TransactionV003 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV003 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV003 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV003", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV003 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV003", id.toString());
    }
}
