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
 * TransactionV039Service — Business logic for TransactionV039 operations.
 */
@ApplicationScoped
public class TransactionV039Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV039Service.class);

    @Inject
    private TransactionV039Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV039> findById(Long id) {
        LOG.debug("Finding TransactionV039 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV039> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV039 create(TransactionV039 entity) {
        LOG.info("Creating TransactionV039");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV039 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV039", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV039 update(Long id, TransactionV039 entity) {
        LOG.info("Updating TransactionV039 id: {}", id);
        TransactionV039 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV039 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV039 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV039", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV039 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV039", id.toString());
    }
}
