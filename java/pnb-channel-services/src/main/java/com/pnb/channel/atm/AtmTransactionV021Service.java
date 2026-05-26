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
 * AtmTransactionV021Service — Business logic for AtmTransactionV021 operations.
 */
@ApplicationScoped
public class AtmTransactionV021Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV021Service.class);

    @Inject
    private AtmTransactionV021Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV021> findById(Long id) {
        LOG.debug("Finding AtmTransactionV021 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV021> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV021 create(AtmTransactionV021 entity) {
        LOG.info("Creating AtmTransactionV021");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV021 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV021", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV021 update(Long id, AtmTransactionV021 entity) {
        LOG.info("Updating AtmTransactionV021 id: {}", id);
        AtmTransactionV021 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV021 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV021 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV021", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV021 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV021", id.toString());
    }
}
