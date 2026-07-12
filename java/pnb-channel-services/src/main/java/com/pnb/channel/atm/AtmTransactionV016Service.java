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
 * AtmTransactionV016Service — Business logic for AtmTransactionV016 operations.
 */
@ApplicationScoped
public class AtmTransactionV016Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV016Service.class);

    @Inject
    private AtmTransactionV016Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV016> findById(Long id) {
        LOG.debug("Finding AtmTransactionV016 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV016> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV016 create(AtmTransactionV016 entity) {
        LOG.info("Creating AtmTransactionV016");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV016 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV016", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV016 update(Long id, AtmTransactionV016 entity) {
        LOG.info("Updating AtmTransactionV016 id: {}", id);
        AtmTransactionV016 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV016 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV016 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV016", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV016 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV016", id.toString());
    }
}
