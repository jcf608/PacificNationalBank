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
 * AtmTransactionV022Service — Business logic for AtmTransactionV022 operations.
 */
@ApplicationScoped
public class AtmTransactionV022Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV022Service.class);

    @Inject
    private AtmTransactionV022Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV022> findById(Long id) {
        LOG.debug("Finding AtmTransactionV022 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV022> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV022 create(AtmTransactionV022 entity) {
        LOG.info("Creating AtmTransactionV022");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV022 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV022", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV022 update(Long id, AtmTransactionV022 entity) {
        LOG.info("Updating AtmTransactionV022 id: {}", id);
        AtmTransactionV022 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV022 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV022 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV022", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV022 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV022", id.toString());
    }
}
