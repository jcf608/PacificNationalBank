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
 * AtmTransactionV035Service — Business logic for AtmTransactionV035 operations.
 */
@ApplicationScoped
public class AtmTransactionV035Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV035Service.class);

    @Inject
    private AtmTransactionV035Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV035> findById(Long id) {
        LOG.debug("Finding AtmTransactionV035 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV035> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV035 create(AtmTransactionV035 entity) {
        LOG.info("Creating AtmTransactionV035");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV035 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV035", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV035 update(Long id, AtmTransactionV035 entity) {
        LOG.info("Updating AtmTransactionV035 id: {}", id);
        AtmTransactionV035 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV035 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV035 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV035", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV035 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV035", id.toString());
    }
}
