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
 * AtmTransactionV028Service — Business logic for AtmTransactionV028 operations.
 */
@ApplicationScoped
public class AtmTransactionV028Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV028Service.class);

    @Inject
    private AtmTransactionV028Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV028> findById(Long id) {
        LOG.debug("Finding AtmTransactionV028 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV028> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV028 create(AtmTransactionV028 entity) {
        LOG.info("Creating AtmTransactionV028");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV028 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV028", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV028 update(Long id, AtmTransactionV028 entity) {
        LOG.info("Updating AtmTransactionV028 id: {}", id);
        AtmTransactionV028 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV028 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV028 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV028", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV028 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV028", id.toString());
    }
}
