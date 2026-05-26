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
 * TransactionV019Service — Business logic for TransactionV019 operations.
 */
@ApplicationScoped
public class TransactionV019Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV019Service.class);

    @Inject
    private TransactionV019Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV019> findById(Long id) {
        LOG.debug("Finding TransactionV019 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV019> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV019 create(TransactionV019 entity) {
        LOG.info("Creating TransactionV019");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV019 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV019", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV019 update(Long id, TransactionV019 entity) {
        LOG.info("Updating TransactionV019 id: {}", id);
        TransactionV019 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV019 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV019 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV019", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV019 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV019", id.toString());
    }
}
