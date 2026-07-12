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
 * AtmTransactionV036Service — Business logic for AtmTransactionV036 operations.
 */
@ApplicationScoped
public class AtmTransactionV036Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV036Service.class);

    @Inject
    private AtmTransactionV036Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV036> findById(Long id) {
        LOG.debug("Finding AtmTransactionV036 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV036> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV036 create(AtmTransactionV036 entity) {
        LOG.info("Creating AtmTransactionV036");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV036 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV036", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV036 update(Long id, AtmTransactionV036 entity) {
        LOG.info("Updating AtmTransactionV036 id: {}", id);
        AtmTransactionV036 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV036 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV036 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV036", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV036 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV036", id.toString());
    }
}
