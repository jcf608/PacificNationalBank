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
 * AtmTransactionV017Service — Business logic for AtmTransactionV017 operations.
 */
@ApplicationScoped
public class AtmTransactionV017Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV017Service.class);

    @Inject
    private AtmTransactionV017Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV017> findById(Long id) {
        LOG.debug("Finding AtmTransactionV017 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV017> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV017 create(AtmTransactionV017 entity) {
        LOG.info("Creating AtmTransactionV017");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV017 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV017", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV017 update(Long id, AtmTransactionV017 entity) {
        LOG.info("Updating AtmTransactionV017 id: {}", id);
        AtmTransactionV017 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV017 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV017 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV017", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV017 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV017", id.toString());
    }
}
