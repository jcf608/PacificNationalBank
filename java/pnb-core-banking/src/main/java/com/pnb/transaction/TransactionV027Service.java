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
 * TransactionV027Service — Business logic for TransactionV027 operations.
 */
@ApplicationScoped
public class TransactionV027Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV027Service.class);

    @Inject
    private TransactionV027Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV027> findById(Long id) {
        LOG.debug("Finding TransactionV027 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV027> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV027 create(TransactionV027 entity) {
        LOG.info("Creating TransactionV027");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV027 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV027", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV027 update(Long id, TransactionV027 entity) {
        LOG.info("Updating TransactionV027 id: {}", id);
        TransactionV027 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV027 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV027 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV027", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV027 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV027", id.toString());
    }
}
