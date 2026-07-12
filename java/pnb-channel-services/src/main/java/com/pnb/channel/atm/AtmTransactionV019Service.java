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
 * AtmTransactionV019Service — Business logic for AtmTransactionV019 operations.
 */
@ApplicationScoped
public class AtmTransactionV019Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV019Service.class);

    @Inject
    private AtmTransactionV019Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV019> findById(Long id) {
        LOG.debug("Finding AtmTransactionV019 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV019> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV019 create(AtmTransactionV019 entity) {
        LOG.info("Creating AtmTransactionV019");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV019 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV019", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV019 update(Long id, AtmTransactionV019 entity) {
        LOG.info("Updating AtmTransactionV019 id: {}", id);
        AtmTransactionV019 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV019 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV019 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV019", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV019 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV019", id.toString());
    }
}
