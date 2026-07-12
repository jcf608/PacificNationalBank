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
 * TransactionV013Service — Business logic for TransactionV013 operations.
 */
@ApplicationScoped
public class TransactionV013Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV013Service.class);

    @Inject
    private TransactionV013Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV013> findById(Long id) {
        LOG.debug("Finding TransactionV013 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV013> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV013 create(TransactionV013 entity) {
        LOG.info("Creating TransactionV013");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV013 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV013", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV013 update(Long id, TransactionV013 entity) {
        LOG.info("Updating TransactionV013 id: {}", id);
        TransactionV013 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV013 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV013 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV013", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV013 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV013", id.toString());
    }
}
