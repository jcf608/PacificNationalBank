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
 * AtmTransactionV038Service — Business logic for AtmTransactionV038 operations.
 */
@ApplicationScoped
public class AtmTransactionV038Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV038Service.class);

    @Inject
    private AtmTransactionV038Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV038> findById(Long id) {
        LOG.debug("Finding AtmTransactionV038 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV038> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV038 create(AtmTransactionV038 entity) {
        LOG.info("Creating AtmTransactionV038");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV038 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV038", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV038 update(Long id, AtmTransactionV038 entity) {
        LOG.info("Updating AtmTransactionV038 id: {}", id);
        AtmTransactionV038 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV038 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV038 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV038", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV038 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV038", id.toString());
    }
}
