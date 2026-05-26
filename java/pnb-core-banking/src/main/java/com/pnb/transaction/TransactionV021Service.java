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
 * TransactionV021Service — Business logic for TransactionV021 operations.
 */
@ApplicationScoped
public class TransactionV021Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV021Service.class);

    @Inject
    private TransactionV021Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV021> findById(Long id) {
        LOG.debug("Finding TransactionV021 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV021> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV021 create(TransactionV021 entity) {
        LOG.info("Creating TransactionV021");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV021 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV021", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV021 update(Long id, TransactionV021 entity) {
        LOG.info("Updating TransactionV021 id: {}", id);
        TransactionV021 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV021 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV021 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV021", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV021 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV021", id.toString());
    }
}
