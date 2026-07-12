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
 * AtmTransactionV005Service — Business logic for AtmTransactionV005 operations.
 */
@ApplicationScoped
public class AtmTransactionV005Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV005Service.class);

    @Inject
    private AtmTransactionV005Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV005> findById(Long id) {
        LOG.debug("Finding AtmTransactionV005 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV005> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV005 create(AtmTransactionV005 entity) {
        LOG.info("Creating AtmTransactionV005");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV005 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV005", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV005 update(Long id, AtmTransactionV005 entity) {
        LOG.info("Updating AtmTransactionV005 id: {}", id);
        AtmTransactionV005 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV005 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV005 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV005", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV005 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV005", id.toString());
    }
}
