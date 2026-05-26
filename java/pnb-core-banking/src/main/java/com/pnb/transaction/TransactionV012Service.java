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
 * TransactionV012Service — Business logic for TransactionV012 operations.
 */
@ApplicationScoped
public class TransactionV012Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV012Service.class);

    @Inject
    private TransactionV012Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV012> findById(Long id) {
        LOG.debug("Finding TransactionV012 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV012> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV012 create(TransactionV012 entity) {
        LOG.info("Creating TransactionV012");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV012 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV012", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV012 update(Long id, TransactionV012 entity) {
        LOG.info("Updating TransactionV012 id: {}", id);
        TransactionV012 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV012 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV012 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV012", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV012 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV012", id.toString());
    }
}
