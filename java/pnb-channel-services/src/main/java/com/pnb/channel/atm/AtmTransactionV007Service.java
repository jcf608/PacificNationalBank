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
 * AtmTransactionV007Service — Business logic for AtmTransactionV007 operations.
 */
@ApplicationScoped
public class AtmTransactionV007Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV007Service.class);

    @Inject
    private AtmTransactionV007Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV007> findById(Long id) {
        LOG.debug("Finding AtmTransactionV007 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV007> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV007 create(AtmTransactionV007 entity) {
        LOG.info("Creating AtmTransactionV007");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV007 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV007", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV007 update(Long id, AtmTransactionV007 entity) {
        LOG.info("Updating AtmTransactionV007 id: {}", id);
        AtmTransactionV007 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV007 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV007 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV007", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV007 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV007", id.toString());
    }
}
