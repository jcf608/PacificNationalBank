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
 * AtmTransactionV023Service — Business logic for AtmTransactionV023 operations.
 */
@ApplicationScoped
public class AtmTransactionV023Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV023Service.class);

    @Inject
    private AtmTransactionV023Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV023> findById(Long id) {
        LOG.debug("Finding AtmTransactionV023 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV023> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV023 create(AtmTransactionV023 entity) {
        LOG.info("Creating AtmTransactionV023");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV023 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV023", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV023 update(Long id, AtmTransactionV023 entity) {
        LOG.info("Updating AtmTransactionV023 id: {}", id);
        AtmTransactionV023 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV023 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV023 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV023", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV023 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV023", id.toString());
    }
}
