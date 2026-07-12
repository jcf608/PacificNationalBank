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
 * AtmTransactionV029Service — Business logic for AtmTransactionV029 operations.
 */
@ApplicationScoped
public class AtmTransactionV029Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV029Service.class);

    @Inject
    private AtmTransactionV029Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV029> findById(Long id) {
        LOG.debug("Finding AtmTransactionV029 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV029> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV029 create(AtmTransactionV029 entity) {
        LOG.info("Creating AtmTransactionV029");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV029 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV029", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV029 update(Long id, AtmTransactionV029 entity) {
        LOG.info("Updating AtmTransactionV029 id: {}", id);
        AtmTransactionV029 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV029 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV029 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV029", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV029 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV029", id.toString());
    }
}
