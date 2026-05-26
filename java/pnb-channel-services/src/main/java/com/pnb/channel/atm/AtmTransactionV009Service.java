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
 * AtmTransactionV009Service — Business logic for AtmTransactionV009 operations.
 */
@ApplicationScoped
public class AtmTransactionV009Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV009Service.class);

    @Inject
    private AtmTransactionV009Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV009> findById(Long id) {
        LOG.debug("Finding AtmTransactionV009 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV009> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV009 create(AtmTransactionV009 entity) {
        LOG.info("Creating AtmTransactionV009");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV009 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV009", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV009 update(Long id, AtmTransactionV009 entity) {
        LOG.info("Updating AtmTransactionV009 id: {}", id);
        AtmTransactionV009 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV009 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV009 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV009", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV009 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV009", id.toString());
    }
}
