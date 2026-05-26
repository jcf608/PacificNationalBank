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
 * AtmTransactionV018Service — Business logic for AtmTransactionV018 operations.
 */
@ApplicationScoped
public class AtmTransactionV018Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV018Service.class);

    @Inject
    private AtmTransactionV018Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV018> findById(Long id) {
        LOG.debug("Finding AtmTransactionV018 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV018> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV018 create(AtmTransactionV018 entity) {
        LOG.info("Creating AtmTransactionV018");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV018 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV018", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV018 update(Long id, AtmTransactionV018 entity) {
        LOG.info("Updating AtmTransactionV018 id: {}", id);
        AtmTransactionV018 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV018 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV018 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV018", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV018 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV018", id.toString());
    }
}
