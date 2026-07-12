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
 * AtmTransactionV010Service — Business logic for AtmTransactionV010 operations.
 */
@ApplicationScoped
public class AtmTransactionV010Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV010Service.class);

    @Inject
    private AtmTransactionV010Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV010> findById(Long id) {
        LOG.debug("Finding AtmTransactionV010 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV010> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV010 create(AtmTransactionV010 entity) {
        LOG.info("Creating AtmTransactionV010");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV010 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV010", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV010 update(Long id, AtmTransactionV010 entity) {
        LOG.info("Updating AtmTransactionV010 id: {}", id);
        AtmTransactionV010 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV010 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV010 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV010", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV010 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV010", id.toString());
    }
}
