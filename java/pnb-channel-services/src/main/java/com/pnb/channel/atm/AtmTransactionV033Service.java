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
 * AtmTransactionV033Service — Business logic for AtmTransactionV033 operations.
 */
@ApplicationScoped
public class AtmTransactionV033Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV033Service.class);

    @Inject
    private AtmTransactionV033Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV033> findById(Long id) {
        LOG.debug("Finding AtmTransactionV033 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV033> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV033 create(AtmTransactionV033 entity) {
        LOG.info("Creating AtmTransactionV033");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV033 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV033", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV033 update(Long id, AtmTransactionV033 entity) {
        LOG.info("Updating AtmTransactionV033 id: {}", id);
        AtmTransactionV033 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV033 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV033 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV033", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV033 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV033", id.toString());
    }
}
