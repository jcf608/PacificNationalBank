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
 * TransactionV020Service — Business logic for TransactionV020 operations.
 */
@ApplicationScoped
public class TransactionV020Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV020Service.class);

    @Inject
    private TransactionV020Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV020> findById(Long id) {
        LOG.debug("Finding TransactionV020 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV020> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV020 create(TransactionV020 entity) {
        LOG.info("Creating TransactionV020");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV020 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV020", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV020 update(Long id, TransactionV020 entity) {
        LOG.info("Updating TransactionV020 id: {}", id);
        TransactionV020 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV020 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV020 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV020", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV020 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV020", id.toString());
    }
}
