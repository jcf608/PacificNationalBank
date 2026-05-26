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
 * TransactionV009Service — Business logic for TransactionV009 operations.
 */
@ApplicationScoped
public class TransactionV009Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV009Service.class);

    @Inject
    private TransactionV009Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV009> findById(Long id) {
        LOG.debug("Finding TransactionV009 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV009> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV009 create(TransactionV009 entity) {
        LOG.info("Creating TransactionV009");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV009 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV009", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV009 update(Long id, TransactionV009 entity) {
        LOG.info("Updating TransactionV009 id: {}", id);
        TransactionV009 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV009 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV009 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV009", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV009 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV009", id.toString());
    }
}
