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
 * TransactionV006Service — Business logic for TransactionV006 operations.
 */
@ApplicationScoped
public class TransactionV006Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV006Service.class);

    @Inject
    private TransactionV006Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV006> findById(Long id) {
        LOG.debug("Finding TransactionV006 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV006> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV006 create(TransactionV006 entity) {
        LOG.info("Creating TransactionV006");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV006 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV006", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV006 update(Long id, TransactionV006 entity) {
        LOG.info("Updating TransactionV006 id: {}", id);
        TransactionV006 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV006 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV006 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV006", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV006 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV006", id.toString());
    }
}
