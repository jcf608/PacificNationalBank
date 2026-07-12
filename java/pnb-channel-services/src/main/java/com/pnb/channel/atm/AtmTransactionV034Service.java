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
 * AtmTransactionV034Service — Business logic for AtmTransactionV034 operations.
 */
@ApplicationScoped
public class AtmTransactionV034Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV034Service.class);

    @Inject
    private AtmTransactionV034Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV034> findById(Long id) {
        LOG.debug("Finding AtmTransactionV034 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV034> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV034 create(AtmTransactionV034 entity) {
        LOG.info("Creating AtmTransactionV034");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV034 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV034", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV034 update(Long id, AtmTransactionV034 entity) {
        LOG.info("Updating AtmTransactionV034 id: {}", id);
        AtmTransactionV034 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV034 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV034 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV034", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV034 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV034", id.toString());
    }
}
