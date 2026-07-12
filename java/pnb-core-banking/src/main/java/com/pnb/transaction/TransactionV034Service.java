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
 * TransactionV034Service — Business logic for TransactionV034 operations.
 */
@ApplicationScoped
public class TransactionV034Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV034Service.class);

    @Inject
    private TransactionV034Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV034> findById(Long id) {
        LOG.debug("Finding TransactionV034 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV034> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV034 create(TransactionV034 entity) {
        LOG.info("Creating TransactionV034");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV034 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV034", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV034 update(Long id, TransactionV034 entity) {
        LOG.info("Updating TransactionV034 id: {}", id);
        TransactionV034 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV034 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV034 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV034", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV034 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV034", id.toString());
    }
}
