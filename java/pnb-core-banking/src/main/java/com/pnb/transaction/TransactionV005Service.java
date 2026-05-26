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
 * TransactionV005Service — Business logic for TransactionV005 operations.
 */
@ApplicationScoped
public class TransactionV005Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV005Service.class);

    @Inject
    private TransactionV005Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV005> findById(Long id) {
        LOG.debug("Finding TransactionV005 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV005> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV005 create(TransactionV005 entity) {
        LOG.info("Creating TransactionV005");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV005 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV005", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV005 update(Long id, TransactionV005 entity) {
        LOG.info("Updating TransactionV005 id: {}", id);
        TransactionV005 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV005 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV005 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV005", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV005 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV005", id.toString());
    }
}
