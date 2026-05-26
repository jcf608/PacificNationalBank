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
 * TransactionV032Service — Business logic for TransactionV032 operations.
 */
@ApplicationScoped
public class TransactionV032Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV032Service.class);

    @Inject
    private TransactionV032Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV032> findById(Long id) {
        LOG.debug("Finding TransactionV032 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV032> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV032 create(TransactionV032 entity) {
        LOG.info("Creating TransactionV032");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV032 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV032", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV032 update(Long id, TransactionV032 entity) {
        LOG.info("Updating TransactionV032 id: {}", id);
        TransactionV032 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV032 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV032 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV032", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV032 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV032", id.toString());
    }
}
