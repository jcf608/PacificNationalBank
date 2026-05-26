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
 * TransactionV038Service — Business logic for TransactionV038 operations.
 */
@ApplicationScoped
public class TransactionV038Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV038Service.class);

    @Inject
    private TransactionV038Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV038> findById(Long id) {
        LOG.debug("Finding TransactionV038 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV038> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV038 create(TransactionV038 entity) {
        LOG.info("Creating TransactionV038");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV038 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV038", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV038 update(Long id, TransactionV038 entity) {
        LOG.info("Updating TransactionV038 id: {}", id);
        TransactionV038 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV038 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV038 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV038", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV038 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV038", id.toString());
    }
}
