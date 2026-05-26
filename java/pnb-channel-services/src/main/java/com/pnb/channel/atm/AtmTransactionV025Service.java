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
 * AtmTransactionV025Service — Business logic for AtmTransactionV025 operations.
 */
@ApplicationScoped
public class AtmTransactionV025Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV025Service.class);

    @Inject
    private AtmTransactionV025Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV025> findById(Long id) {
        LOG.debug("Finding AtmTransactionV025 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV025> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV025 create(AtmTransactionV025 entity) {
        LOG.info("Creating AtmTransactionV025");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV025 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV025", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV025 update(Long id, AtmTransactionV025 entity) {
        LOG.info("Updating AtmTransactionV025 id: {}", id);
        AtmTransactionV025 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV025 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV025 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV025", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV025 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV025", id.toString());
    }
}
