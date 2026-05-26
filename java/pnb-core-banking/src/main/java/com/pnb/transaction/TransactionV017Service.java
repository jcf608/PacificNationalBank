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
 * TransactionV017Service — Business logic for TransactionV017 operations.
 */
@ApplicationScoped
public class TransactionV017Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV017Service.class);

    @Inject
    private TransactionV017Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV017> findById(Long id) {
        LOG.debug("Finding TransactionV017 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV017> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV017 create(TransactionV017 entity) {
        LOG.info("Creating TransactionV017");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV017 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV017", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV017 update(Long id, TransactionV017 entity) {
        LOG.info("Updating TransactionV017 id: {}", id);
        TransactionV017 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV017 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV017 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV017", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV017 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV017", id.toString());
    }
}
