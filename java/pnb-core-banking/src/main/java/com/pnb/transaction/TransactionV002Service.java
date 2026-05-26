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
 * TransactionV002Service — Business logic for TransactionV002 operations.
 */
@ApplicationScoped
public class TransactionV002Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV002Service.class);

    @Inject
    private TransactionV002Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV002> findById(Long id) {
        LOG.debug("Finding TransactionV002 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV002> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV002 create(TransactionV002 entity) {
        LOG.info("Creating TransactionV002");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV002 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV002", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV002 update(Long id, TransactionV002 entity) {
        LOG.info("Updating TransactionV002 id: {}", id);
        TransactionV002 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV002 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV002 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV002", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV002 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV002", id.toString());
    }
}
