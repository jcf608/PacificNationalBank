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
 * TransactionV007Service — Business logic for TransactionV007 operations.
 */
@ApplicationScoped
public class TransactionV007Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV007Service.class);

    @Inject
    private TransactionV007Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV007> findById(Long id) {
        LOG.debug("Finding TransactionV007 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV007> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV007 create(TransactionV007 entity) {
        LOG.info("Creating TransactionV007");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV007 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV007", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV007 update(Long id, TransactionV007 entity) {
        LOG.info("Updating TransactionV007 id: {}", id);
        TransactionV007 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV007 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV007 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV007", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV007 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV007", id.toString());
    }
}
