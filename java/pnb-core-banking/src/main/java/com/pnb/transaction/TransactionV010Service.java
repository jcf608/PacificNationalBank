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
 * TransactionV010Service — Business logic for TransactionV010 operations.
 */
@ApplicationScoped
public class TransactionV010Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV010Service.class);

    @Inject
    private TransactionV010Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV010> findById(Long id) {
        LOG.debug("Finding TransactionV010 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV010> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV010 create(TransactionV010 entity) {
        LOG.info("Creating TransactionV010");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV010 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV010", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV010 update(Long id, TransactionV010 entity) {
        LOG.info("Updating TransactionV010 id: {}", id);
        TransactionV010 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV010 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV010 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV010", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV010 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV010", id.toString());
    }
}
