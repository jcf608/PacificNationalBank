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
 * AtmTransactionV002Service — Business logic for AtmTransactionV002 operations.
 */
@ApplicationScoped
public class AtmTransactionV002Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV002Service.class);

    @Inject
    private AtmTransactionV002Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV002> findById(Long id) {
        LOG.debug("Finding AtmTransactionV002 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV002> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV002 create(AtmTransactionV002 entity) {
        LOG.info("Creating AtmTransactionV002");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV002 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV002", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV002 update(Long id, AtmTransactionV002 entity) {
        LOG.info("Updating AtmTransactionV002 id: {}", id);
        AtmTransactionV002 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV002 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV002 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV002", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV002 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV002", id.toString());
    }
}
