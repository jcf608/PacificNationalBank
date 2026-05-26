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
 * TransactionV035Service — Business logic for TransactionV035 operations.
 */
@ApplicationScoped
public class TransactionV035Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV035Service.class);

    @Inject
    private TransactionV035Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV035> findById(Long id) {
        LOG.debug("Finding TransactionV035 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV035> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV035 create(TransactionV035 entity) {
        LOG.info("Creating TransactionV035");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV035 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV035", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV035 update(Long id, TransactionV035 entity) {
        LOG.info("Updating TransactionV035 id: {}", id);
        TransactionV035 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV035 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV035 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV035", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV035 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV035", id.toString());
    }
}
