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
 * AtmTransactionV015Service — Business logic for AtmTransactionV015 operations.
 */
@ApplicationScoped
public class AtmTransactionV015Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV015Service.class);

    @Inject
    private AtmTransactionV015Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV015> findById(Long id) {
        LOG.debug("Finding AtmTransactionV015 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV015> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV015 create(AtmTransactionV015 entity) {
        LOG.info("Creating AtmTransactionV015");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV015 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV015", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV015 update(Long id, AtmTransactionV015 entity) {
        LOG.info("Updating AtmTransactionV015 id: {}", id);
        AtmTransactionV015 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV015 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV015 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV015", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV015 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV015", id.toString());
    }
}
