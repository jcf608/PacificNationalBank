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
 * TransactionV018Service — Business logic for TransactionV018 operations.
 */
@ApplicationScoped
public class TransactionV018Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV018Service.class);

    @Inject
    private TransactionV018Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV018> findById(Long id) {
        LOG.debug("Finding TransactionV018 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV018> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV018 create(TransactionV018 entity) {
        LOG.info("Creating TransactionV018");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV018 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV018", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV018 update(Long id, TransactionV018 entity) {
        LOG.info("Updating TransactionV018 id: {}", id);
        TransactionV018 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV018 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV018 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV018", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV018 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV018", id.toString());
    }
}
