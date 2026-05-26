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
 * TransactionV036Service — Business logic for TransactionV036 operations.
 */
@ApplicationScoped
public class TransactionV036Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV036Service.class);

    @Inject
    private TransactionV036Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV036> findById(Long id) {
        LOG.debug("Finding TransactionV036 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV036> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV036 create(TransactionV036 entity) {
        LOG.info("Creating TransactionV036");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV036 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV036", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV036 update(Long id, TransactionV036 entity) {
        LOG.info("Updating TransactionV036 id: {}", id);
        TransactionV036 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV036 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV036 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV036", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV036 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV036", id.toString());
    }
}
