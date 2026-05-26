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
 * AtmTransactionV032Service — Business logic for AtmTransactionV032 operations.
 */
@ApplicationScoped
public class AtmTransactionV032Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV032Service.class);

    @Inject
    private AtmTransactionV032Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV032> findById(Long id) {
        LOG.debug("Finding AtmTransactionV032 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV032> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV032 create(AtmTransactionV032 entity) {
        LOG.info("Creating AtmTransactionV032");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV032 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV032", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV032 update(Long id, AtmTransactionV032 entity) {
        LOG.info("Updating AtmTransactionV032 id: {}", id);
        AtmTransactionV032 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV032 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV032 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV032", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV032 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV032", id.toString());
    }
}
