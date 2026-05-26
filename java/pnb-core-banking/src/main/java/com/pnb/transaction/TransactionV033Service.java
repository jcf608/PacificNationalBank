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
 * TransactionV033Service — Business logic for TransactionV033 operations.
 */
@ApplicationScoped
public class TransactionV033Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV033Service.class);

    @Inject
    private TransactionV033Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV033> findById(Long id) {
        LOG.debug("Finding TransactionV033 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV033> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV033 create(TransactionV033 entity) {
        LOG.info("Creating TransactionV033");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV033 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV033", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV033 update(Long id, TransactionV033 entity) {
        LOG.info("Updating TransactionV033 id: {}", id);
        TransactionV033 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV033 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV033 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV033", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV033 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV033", id.toString());
    }
}
