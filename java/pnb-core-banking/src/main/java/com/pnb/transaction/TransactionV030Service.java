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
 * TransactionV030Service — Business logic for TransactionV030 operations.
 */
@ApplicationScoped
public class TransactionV030Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV030Service.class);

    @Inject
    private TransactionV030Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV030> findById(Long id) {
        LOG.debug("Finding TransactionV030 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV030> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV030 create(TransactionV030 entity) {
        LOG.info("Creating TransactionV030");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV030 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV030", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV030 update(Long id, TransactionV030 entity) {
        LOG.info("Updating TransactionV030 id: {}", id);
        TransactionV030 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV030 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV030 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV030", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV030 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV030", id.toString());
    }
}
