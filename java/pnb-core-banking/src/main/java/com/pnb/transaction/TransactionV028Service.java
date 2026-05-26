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
 * TransactionV028Service — Business logic for TransactionV028 operations.
 */
@ApplicationScoped
public class TransactionV028Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV028Service.class);

    @Inject
    private TransactionV028Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV028> findById(Long id) {
        LOG.debug("Finding TransactionV028 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV028> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV028 create(TransactionV028 entity) {
        LOG.info("Creating TransactionV028");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV028 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV028", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV028 update(Long id, TransactionV028 entity) {
        LOG.info("Updating TransactionV028 id: {}", id);
        TransactionV028 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV028 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV028 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV028", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV028 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV028", id.toString());
    }
}
