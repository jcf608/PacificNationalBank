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
 * TransactionV024Service — Business logic for TransactionV024 operations.
 */
@ApplicationScoped
public class TransactionV024Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV024Service.class);

    @Inject
    private TransactionV024Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV024> findById(Long id) {
        LOG.debug("Finding TransactionV024 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV024> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV024 create(TransactionV024 entity) {
        LOG.info("Creating TransactionV024");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV024 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV024", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV024 update(Long id, TransactionV024 entity) {
        LOG.info("Updating TransactionV024 id: {}", id);
        TransactionV024 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV024 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV024 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV024", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV024 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV024", id.toString());
    }
}
