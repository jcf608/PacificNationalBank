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
 * AtmTransactionV001Service — Business logic for AtmTransactionV001 operations.
 */
@ApplicationScoped
public class AtmTransactionV001Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV001Service.class);

    @Inject
    private AtmTransactionV001Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV001> findById(Long id) {
        LOG.debug("Finding AtmTransactionV001 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV001> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV001 create(AtmTransactionV001 entity) {
        LOG.info("Creating AtmTransactionV001");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV001 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV001", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV001 update(Long id, AtmTransactionV001 entity) {
        LOG.info("Updating AtmTransactionV001 id: {}", id);
        AtmTransactionV001 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV001 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV001 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV001", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV001 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV001", id.toString());
    }
}
