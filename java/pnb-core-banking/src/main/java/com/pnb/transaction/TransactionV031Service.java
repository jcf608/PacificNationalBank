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
 * TransactionV031Service — Business logic for TransactionV031 operations.
 */
@ApplicationScoped
public class TransactionV031Service {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionV031Service.class);

    @Inject
    private TransactionV031Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<TransactionV031> findById(Long id) {
        LOG.debug("Finding TransactionV031 by id: {}", id);
        return repository.findById(id);
    }

    public List<TransactionV031> findAll() {
        return repository.findAll();
    }

    @Transactional
    public TransactionV031 create(TransactionV031 entity) {
        LOG.info("Creating TransactionV031");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV031 saved = repository.save(entity);
        auditService.log("CREATE", "TransactionV031", saved.getId().toString());
        return saved;
    }

    @Transactional
    public TransactionV031 update(Long id, TransactionV031 entity) {
        LOG.info("Updating TransactionV031 id: {}", id);
        TransactionV031 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("TransactionV031 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        TransactionV031 updated = repository.save(entity);
        auditService.log("UPDATE", "TransactionV031", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting TransactionV031 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "TransactionV031", id.toString());
    }
}
