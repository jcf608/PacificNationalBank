package com.pnb.channel.atm;

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
 * AtmTransactionV026Service — Business logic for AtmTransactionV026 operations.
 */
@ApplicationScoped
public class AtmTransactionV026Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV026Service.class);

    @Inject
    private AtmTransactionV026Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV026> findById(Long id) {
        LOG.debug("Finding AtmTransactionV026 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV026> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV026 create(AtmTransactionV026 entity) {
        LOG.info("Creating AtmTransactionV026");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV026 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV026", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV026 update(Long id, AtmTransactionV026 entity) {
        LOG.info("Updating AtmTransactionV026 id: {}", id);
        AtmTransactionV026 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV026 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV026 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV026", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV026 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV026", id.toString());
    }
}
