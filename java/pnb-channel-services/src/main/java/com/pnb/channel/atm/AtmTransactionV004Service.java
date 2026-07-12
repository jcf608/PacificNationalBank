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
 * AtmTransactionV004Service — Business logic for AtmTransactionV004 operations.
 */
@ApplicationScoped
public class AtmTransactionV004Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV004Service.class);

    @Inject
    private AtmTransactionV004Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV004> findById(Long id) {
        LOG.debug("Finding AtmTransactionV004 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV004> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV004 create(AtmTransactionV004 entity) {
        LOG.info("Creating AtmTransactionV004");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV004 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV004", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV004 update(Long id, AtmTransactionV004 entity) {
        LOG.info("Updating AtmTransactionV004 id: {}", id);
        AtmTransactionV004 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV004 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV004 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV004", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV004 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV004", id.toString());
    }
}
