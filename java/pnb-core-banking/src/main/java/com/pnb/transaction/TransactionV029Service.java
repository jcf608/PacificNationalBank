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
 * TransactionV029Service — Business logic for TransactionV029 operations.
 */
@ApplicationScoped
public class TransactionV029Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV029Service.class);

    @Inject
    private TransactionV029Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV029> findById(Long id) {
        LOG.debug("Finding TransactionV029 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV029> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV029 create(TransactionV029 entity) {
        LOG.info("Creating TransactionV029");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV029 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV029", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV029 update(Long id, TransactionV029 entity) {
        LOG.info("Updating TransactionV029 id: {}", id);
        TransactionV029 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV029 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV029 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV029", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV029 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV029", id.toString());
    }
}
