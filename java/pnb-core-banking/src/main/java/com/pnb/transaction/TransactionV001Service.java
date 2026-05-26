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
 * TransactionV001Service — Business logic for TransactionV001 operations.
 */
@ApplicationScoped
public class TransactionV001Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV001Service.class);

    @Inject
    private TransactionV001Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV001> findById(Long id) {
        LOG.debug("Finding TransactionV001 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV001> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV001 create(TransactionV001 entity) {
        LOG.info("Creating TransactionV001");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV001 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV001", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV001 update(Long id, TransactionV001 entity) {
        LOG.info("Updating TransactionV001 id: {}", id);
        TransactionV001 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV001 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV001 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV001", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV001 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV001", id.toString());
    }
}
