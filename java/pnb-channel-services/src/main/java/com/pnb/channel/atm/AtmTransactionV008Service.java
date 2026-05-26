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
 * AtmTransactionV008Service — Business logic for AtmTransactionV008 operations.
 */
@ApplicationScoped
public class AtmTransactionV008Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV008Service.class);

    @Inject
    private AtmTransactionV008Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV008> findById(Long id) {
        LOG.debug("Finding AtmTransactionV008 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV008> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV008 create(AtmTransactionV008 entity) {
        LOG.info("Creating AtmTransactionV008");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV008 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV008", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV008 update(Long id, AtmTransactionV008 entity) {
        LOG.info("Updating AtmTransactionV008 id: {}", id);
        AtmTransactionV008 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV008 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV008 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV008", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV008 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV008", id.toString());
    }
}
