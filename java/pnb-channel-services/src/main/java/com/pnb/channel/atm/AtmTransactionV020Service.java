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
 * AtmTransactionV020Service — Business logic for AtmTransactionV020 operations.
 */
@ApplicationScoped
public class AtmTransactionV020Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV020Service.class);

    @Inject
    private AtmTransactionV020Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV020> findById(Long id) {
        LOG.debug("Finding AtmTransactionV020 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV020> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV020 create(AtmTransactionV020 entity) {
        LOG.info("Creating AtmTransactionV020");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV020 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV020", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV020 update(Long id, AtmTransactionV020 entity) {
        LOG.info("Updating AtmTransactionV020 id: {}", id);
        AtmTransactionV020 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV020 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV020 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV020", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV020 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV020", id.toString());
    }
}
