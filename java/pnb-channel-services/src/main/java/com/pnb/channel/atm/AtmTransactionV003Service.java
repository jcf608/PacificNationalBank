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
 * AtmTransactionV003Service — Business logic for AtmTransactionV003 operations.
 */
@ApplicationScoped
public class AtmTransactionV003Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV003Service.class);

    @Inject
    private AtmTransactionV003Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV003> findById(Long id) {
        LOG.debug("Finding AtmTransactionV003 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV003> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV003 create(AtmTransactionV003 entity) {
        LOG.info("Creating AtmTransactionV003");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV003 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV003", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV003 update(Long id, AtmTransactionV003 entity) {
        LOG.info("Updating AtmTransactionV003 id: {}", id);
        AtmTransactionV003 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV003 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV003 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV003", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV003 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV003", id.toString());
    }
}
