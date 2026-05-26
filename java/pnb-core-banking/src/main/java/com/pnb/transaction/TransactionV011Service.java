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
 * TransactionV011Service — Business logic for TransactionV011 operations.
 */
@ApplicationScoped
public class TransactionV011Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV011Service.class);

    @Inject
    private TransactionV011Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV011> findById(Long id) {
        LOG.debug("Finding TransactionV011 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV011> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV011 create(TransactionV011 entity) {
        LOG.info("Creating TransactionV011");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV011 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV011", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV011 update(Long id, TransactionV011 entity) {
        LOG.info("Updating TransactionV011 id: {}", id);
        TransactionV011 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV011 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV011 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV011", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV011 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV011", id.toString());
    }
}
