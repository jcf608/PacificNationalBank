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
 * AtmTransactionV030Service — Business logic for AtmTransactionV030 operations.
 */
@ApplicationScoped
public class AtmTransactionV030Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV030Service.class);

    @Inject
    private AtmTransactionV030Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV030> findById(Long id) {
        LOG.debug("Finding AtmTransactionV030 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV030> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV030 create(AtmTransactionV030 entity) {
        LOG.info("Creating AtmTransactionV030");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV030 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV030", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV030 update(Long id, AtmTransactionV030 entity) {
        LOG.info("Updating AtmTransactionV030 id: {}", id);
        AtmTransactionV030 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV030 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV030 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV030", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV030 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV030", id.toString());
    }
}
