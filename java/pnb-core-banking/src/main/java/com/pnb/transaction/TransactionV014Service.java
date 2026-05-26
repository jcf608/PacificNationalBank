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
 * TransactionV014Service — Business logic for TransactionV014 operations.
 */
@ApplicationScoped
public class TransactionV014Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV014Service.class);

    @Inject
    private TransactionV014Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV014> findById(Long id) {
        LOG.debug("Finding TransactionV014 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV014> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV014 create(TransactionV014 entity) {
        LOG.info("Creating TransactionV014");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV014 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV014", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV014 update(Long id, TransactionV014 entity) {
        LOG.info("Updating TransactionV014 id: {}", id);
        TransactionV014 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV014 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV014 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV014", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV014 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV014", id.toString());
    }
}
