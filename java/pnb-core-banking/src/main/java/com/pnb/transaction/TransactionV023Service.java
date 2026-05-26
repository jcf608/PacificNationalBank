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
 * TransactionV023Service — Business logic for TransactionV023 operations.
 */
@ApplicationScoped
public class TransactionV023Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV023Service.class);

    @Inject
    private TransactionV023Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV023> findById(Long id) {
        LOG.debug("Finding TransactionV023 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV023> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV023 create(TransactionV023 entity) {
        LOG.info("Creating TransactionV023");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV023 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV023", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV023 update(Long id, TransactionV023 entity) {
        LOG.info("Updating TransactionV023 id: {}", id);
        TransactionV023 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV023 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV023 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV023", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV023 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV023", id.toString());
    }
}
