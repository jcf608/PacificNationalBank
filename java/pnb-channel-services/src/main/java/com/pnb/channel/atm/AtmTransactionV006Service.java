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
 * AtmTransactionV006Service — Business logic for AtmTransactionV006 operations.
 */
@ApplicationScoped
public class AtmTransactionV006Service {

    private static final Logger LOG = LoggerFactory.getLogger(AtmTransactionV006Service.class);

    @Inject
    private AtmTransactionV006Repository repository;

    @Inject
    private AuditService auditService;

    public Optional<AtmTransactionV006> findById(Long id) {
        LOG.debug("Finding AtmTransactionV006 by id: {}", id);
        return repository.findById(id);
    }

    public List<AtmTransactionV006> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AtmTransactionV006 create(AtmTransactionV006 entity) {
        LOG.info("Creating AtmTransactionV006");
        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV006 saved = repository.save(entity);
        auditService.log("CREATE", "AtmTransactionV006", saved.getId().toString());
        return saved;
    }

    @Transactional
    public AtmTransactionV006 update(Long id, AtmTransactionV006 entity) {
        LOG.info("Updating AtmTransactionV006 id: {}", id);
        AtmTransactionV006 existing = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("AtmTransactionV006 not found: " + id));
        entity.setId(id);
        entity.setCreatedAt(existing.getCreatedAt());
        entity.setUpdatedAt(LocalDateTime.now());
        AtmTransactionV006 updated = repository.save(entity);
        auditService.log("UPDATE", "AtmTransactionV006", id.toString());
        return updated;
    }

    @Transactional
    public void delete(Long id) {
        LOG.info("Deleting AtmTransactionV006 id: {}", id);
        repository.deleteById(id);
        auditService.log("DELETE", "AtmTransactionV006", id.toString());
    }
}
